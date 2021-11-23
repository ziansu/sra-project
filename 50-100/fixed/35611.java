public java.lang.String toString() {
    java.lang.String s;
    switch (relation) {
        case ALWAYS :
            s = "A";
            break;
        case SOMETIMES :
            s = "S";
            break;
        case NEVER :
            s = "N";
            break;
        default :
            s = "U";
            break;
    }
    return s;
}