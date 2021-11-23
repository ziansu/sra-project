public static double std(org.dynami.core.data.Series series) {
    double avg = org.dynami.core.utils.StatUtils.avg(series);
    double sum = 0;
    for (java.lang.Double d : series) {
        sum += java.lang.Math.pow((d - avg), 2);
    }
    return java.lang.Math.sqrt(((sum / (series.size())) - 1));
}