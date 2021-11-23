public int getMethodNumber(java.lang.String name, mjc.gc.ARGLIST args) {
    int number = 0;
    java.util.ArrayList<mjc.gc.VTABLEENTRY> metList = tds.getAllAccessibleMethods();
    for (mjc.gc.VTABLEENTRY e : metList) {
        if ((name.equals(e.getName())) && (args.equals(e.getMethod().getArgs()))) {
            return number;
        }else {
            number++;
        }
    }
    return -1;
}