public static int getColumnsNumberFromDimension(java.lang.String dimension) {
    if (org.apache.commons.lang.StringUtils.isEmpty(dimension)) {
        return 0;
    }
    java.lang.String[] parts = org.apache.commons.lang.StringUtils.split(dimension, ':');
    if ((parts.length) < 2) {
        return 0;
    }
    java.lang.String secondPart = parts[1];
    return org.talend.dataprep.schema.xls.XlsUtils.getColumnsNumberLastCell(secondPart);
}