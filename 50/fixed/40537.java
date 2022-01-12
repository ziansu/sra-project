public static foam.dao.Sink MIN(java.lang.Object o1) {
    foam.mlang.Min min = new foam.mlang.Min();
    min.setArg1(foam.mlang.MLang.prepare(o1));
    return min;
}