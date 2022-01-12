protected static boolean isBeakerChart(java.lang.Object result) {
    boolean ret = false;
    if (result != null) {
        for (java.lang.Class<?> clazz : getSerializerMap().keySet()) {
            ret = clazz.isAssignableFrom(result.getClass());
            if (ret) {
                break;
            }
        }
    }
    return ret;
}