public static void doPredicateAssert(lc.api.jit.AnyPredicate dictate, java.lang.Object[] conditions, java.lang.Object... params) {
    try {
        if (!(dictate.test(conditions))) {
            lc.common.LCLog.fatal(params);
            throw new java.lang.Error("A proxied assertion error in LanteaCraft occurred.");
        }
    } catch (java.lang.Exception e) {
        lc.common.LCLog.fatal(params);
    }
}