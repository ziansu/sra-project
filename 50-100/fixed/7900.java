private static float[] toEffectiveTableColumnWidth(float[] tableColumnWidth) {
    float[] result = new float[tableColumnWidth.length];
    for (int i = 0; i < (result.length); ++i) {
        result[i] = (tableColumnWidth[i]) + (com.itextpdf.layout.minmaxwidth.MinMaxWidthUtils.getEps());
    }
    return result;
}