@java.lang.Override
public boolean doAction(java.lang.String value) {
    char choice = value.toUpperCase().charAt(0);
    switch (choice) {
        case 'P' :
            this.startPickUpTNT();
            break;
        case 'D' :
            this.startDropTNT();
            break;
        case 'U' :
            this.startUseTNT();
            break;
        case 'B' :
            return true;
        default :
            this.console.println("\n*** Invalid selection*** Try again");
            break;
    }
    return false;
}