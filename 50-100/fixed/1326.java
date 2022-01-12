private static com.itextpdf.layout.property.UnitValue[] normalizeColumnWidths(int numberOfColumns) {
    com.itextpdf.layout.property.UnitValue[] normalized = new com.itextpdf.layout.property.UnitValue[numberOfColumns];
    for (int i = 0; i < numberOfColumns; i++) {
        normalized[i] = com.itextpdf.layout.property.UnitValue.createPercentValue((((float) (100)) / numberOfColumns));
    }
    return normalized;
}