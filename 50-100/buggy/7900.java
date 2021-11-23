private static float[] toEffectiveTableColumnWidth(float[] tableColumnWidth) {
    float[] result = tableColumnWidth.clone();
    for (int i = 0; i < (result.length); ++i) {
        result[i] += com.itextpdf.layout.minmaxwidth.MinMaxWidthUtils.getEps();
    }
    return result;
}