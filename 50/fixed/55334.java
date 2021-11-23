private java.lang.String columnSeparator() {
    java.lang.String space = org.apache.commons.lang3.StringUtils.repeat(" ", org.opendaylight.infrautils.utils.TablePrinter.SPACE_BETWEEN_COLUMNS);
    return (space + "|") + space;
}