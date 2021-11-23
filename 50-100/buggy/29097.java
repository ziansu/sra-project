public char int2base(int x) {
    char base;
    switch (x) {
        case 0 :
            base = 'A';
            break;
        case 1 :
            base = 'C';
            break;
        case 2 :
            base = 'G';
            break;
        case 3 :
            base = 'T';
            break;
        case 4 :
            base = 'N';
        default :
            throw new java.lang.IllegalArgumentException(("Invalid int: " + x));
    }
    return base;
}