private void createFormatString(final int precision, final boolean b) {
    switch (formatOfTicks) {
        case autoMode :
            tickFormat = (b) ? java.lang.String.format("%%.%de", precision) : java.lang.String.format("%%.%df", precision);
            break;
        case useExponent :
            tickFormat = java.lang.String.format("%%.%de", precision);
            break;
        default :
            tickFormat = null;
            break;
    }
}