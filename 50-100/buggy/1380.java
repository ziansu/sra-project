private java.lang.String formatSizeValue(long value) {
    org.linagora.linshare.core.domain.constants.FileSizeUnit unit = org.linagora.linshare.core.domain.constants.FileSizeUnit.getMaxExactPlainSizeUnit(_s);
    return java.lang.String.format("%d %s", unit.fromPlainSize(value), messages.get((("FileSizeUnit." + (unit.name())) + ".short")));
}