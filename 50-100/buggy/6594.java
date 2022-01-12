public static int calculateMax(java.lang.String[] args) {
    int toReturn = -1;
    if ((args.length) > 0) {
        toReturn = ((int) (java.lang.Integer.parseInt(args[0])));
        if (toReturn < 1) {
            throw new java.lang.IllegalArgumentException();
        }else {
        }
    }else {
        new java.lang.IllegalArgumentException();
    }
    return toReturn;
}