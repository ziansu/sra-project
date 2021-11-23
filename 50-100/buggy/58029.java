public java.lang.String currentDesc() {
    int current_desc;
    java.lang.String msg = new java.lang.String();
    switch (this.visited) {
        case 0 :
            current_desc = 0;
            break;
        case 1 :
            current_desc = 1;
            break;
        default :
            current_desc = 2;
    }
    if ((inventory.usableItems()) > 0) {
        msg = "\n\nThe location contains:\n";
        msg += inventory.toString();
    }
    return (desc[current_desc]) + msg;
}