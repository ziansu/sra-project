private void createFormatString(final int precision, final boolean useExponent) {
    switch (formatOfTicks) {
        case autoMode :
            tickFormat = (useExponent) ? java.lang.String.format("%%.%de", precision) : java.lang.String.format("%%.%df", precision);
            break;
        case useExponent :
            tickFormat = java.lang.String.format("%%.%de", precision);
            break;
        default :
            tickFormat = null;
            break;
    }
}