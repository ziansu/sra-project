private static int checkargumentlength(java.lang.String[] args) throws java.lang.Exception {
    if (((args.length) < 6) && ((args.length) != 1)) {
        throw new java.lang.Exception();
    }else
        if ((args.length) > 8) {
            throw new java.lang.Exception();
        }
    
    return args.length;
}