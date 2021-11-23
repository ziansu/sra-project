public int base2int(char base) {
    int intVal = -1;
    switch (base) {
        case 'A' :
            intVal = 0;
            break;
        case 'C' :
            intVal = 1;
            break;
        case 'G' :
            intVal = 2;
            break;
        case 'T' :
            intVal = 3;
            break;
        case 'N' :
            intVal = 4;
            break;
        default :
            throw new java.lang.IllegalArgumentException(("Invalid character: " + base));
    }
    return intVal;
}