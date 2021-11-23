private static double compare(final java.lang.String v1, final java.lang.String v2, final double high, final double low, final java.util.Comparator comparator) {
    if (comparator == null) {
        return org.yaba.entity.script.EntityResolutionScript.AVERAGE_SCORE;
    }
    double sim = comparator.compare(v1, v2);
    if (sim < low) {
        return low;
    }else {
        return ((high - (org.yaba.entity.script.EntityResolutionScript.AVERAGE_SCORE)) * (sim * sim)) + (org.yaba.entity.script.EntityResolutionScript.AVERAGE_SCORE);
    }
}