private void normalize() {
    normStatisticalSeries.clear();
    double normedVal;
    double size = groupedStatisticalSeries.size();
    for (double val : groupedStatisticalSeries) {
        normedVal = val / size;
        normStatisticalSeries.add(normedVal);
    }
    java.lang.System.out.println(("-----" + (normStatisticalSeries)));
}