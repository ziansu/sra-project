private static synchronized org.mathpiper.mpreduce.Interpreter2 getStaticInterpreter() {
    if ((geogebra.cas.mpreduce.CASmpreduce.mpreduce_static) == null) {
        geogebra.cas.mpreduce.CASmpreduce.mpreduce_static = new org.mathpiper.mpreduce.Interpreter2();
        try {
            geogebra.cas.mpreduce.CASmpreduce.loadMyMPReduceFunctions(geogebra.cas.mpreduce.CASmpreduce.mpreduce_static);
        } catch (java.lang.Throwable e) {
        }
        geogebra.main.Application.setCASVersionString(geogebra.cas.mpreduce.CASmpreduce.getVersionString(geogebra.cas.mpreduce.CASmpreduce.mpreduce_static));
    }
    return geogebra.cas.mpreduce.CASmpreduce.mpreduce_static;
}