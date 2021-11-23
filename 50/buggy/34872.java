public static void addConstant(java.lang.String cons, double value) {
    if (com.ruh.exprcal.fragments.Constant.isNotDefault(cons))
        com.ruh.exprcal.fragments.Constant.cons_pool.put(cons.toUpperCase(), value);
    
}