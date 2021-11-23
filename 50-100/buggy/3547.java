public java.lang.String formatMeters(double metre) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append(ru.sukharev.pathtracker.utils.Measurement.DECIMAL_FORMAT.format(convertMeters(metre)));
    builder.append(Commons.SPACE);
    appendDistanceSuffix(builder);
    builder.append(Commons.DOT);
    return builder.toString();
}