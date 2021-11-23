public static void printInstanceVal(double[] value) {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    fu.hao.utils.Log.msg(fu.hao.analysis.flows.ModelTrainerLite.TAG, value.length);
    for (double subValue : value) {
        stringBuilder.append((subValue + ","));
    }
    fu.hao.utils.Log.msg(fu.hao.analysis.flows.ModelTrainerLite.TAG, stringBuilder.toString());
}