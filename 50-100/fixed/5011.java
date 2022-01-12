@java.lang.Override
public void setArgs(java.lang.String[] args) throws java.lang.Exception {
    double b;
    if ((args == null) || ((args.length) == 0)) {
        b = 0.5;
    }else {
        b = java.lang.Double.parseDouble(args[0]);
    }
    if ((b <= 0) || (b >= 1)) {
        throw new java.lang.Exception("The weight factor should be in the range [0, 1]");
    }
    beta = b;
}