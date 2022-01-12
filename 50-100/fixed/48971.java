private void normalize() {
    normStatisticalSeries.clear();
    double normedVal;
    double size = groupedStatisticalSeries.size();
    for (double val : groupedStatisticalSeries) {
        normedVal = val / size;
        normStatisticalSeries.add(normedVal);
    }
    normStatisticalSeries.add(0.0);
    java.lang.System.out.println(("-----" + (normStatisticalSeries)));
}