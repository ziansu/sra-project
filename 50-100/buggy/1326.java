private static com.itextpdf.layout.property.UnitValue[] normalizeColumnWidths(int numberOfColumns, boolean usePercents) {
    com.itextpdf.layout.property.UnitValue[] normalized = new com.itextpdf.layout.property.UnitValue[numberOfColumns];
    for (int i = 0; i < numberOfColumns; i++) {
        normalized[i] = (usePercents) ? com.itextpdf.layout.property.UnitValue.createPercentValue((((float) (100)) / numberOfColumns)) : com.itextpdf.layout.property.UnitValue.createPointValue((-1));
    }
    return normalized;
}