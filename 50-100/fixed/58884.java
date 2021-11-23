private java.lang.String[] removeIndexUntil(int index, java.lang.String[] args) {
    if ((args.length) == index)
        return null;
    
    java.lang.String[] hulp = new java.lang.String[((args.length) - 1) - index];
    int j = 0;
    for (int i = index; i < (args.length); i++) {
        hulp[j] = args[i];
        j += 1;
    }
    return hulp;
}