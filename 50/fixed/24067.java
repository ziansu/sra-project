private static void ensureMinimumFieldCount(com.addthis.bundle.core.BundleFormat format, int targetCount) {
    int suffixNum = 0;
    while ((format.getFieldCount()) < targetCount) {
        format.getField(("__op_percent_dist_anon_" + suffixNum));
        suffixNum += 1;
    } 
}