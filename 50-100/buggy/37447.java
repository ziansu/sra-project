public static org.eclipse.january.dataset.Dataset iqr(final org.eclipse.january.dataset.Dataset a, final int axis) {
    org.eclipse.january.dataset.Stats.QStatisticsImpl<?> qs = org.eclipse.january.dataset.Stats.getQStatistics(a, axis);
    org.eclipse.january.dataset.Dataset q3 = qs.getQuantile(axis, org.eclipse.january.dataset.Stats.QStatisticsImpl.Q3);
    return org.eclipse.january.dataset.Maths.subtract(q3, qs.getQuantile(org.eclipse.january.dataset.Stats.QStatisticsImpl.Q1));
}