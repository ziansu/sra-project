public static org.jebtk.math.matrix.AnnotationMatrix parseCsvMatrix(java.nio.file.Path file, boolean hasHeader, java.util.List<java.lang.String> skipMatches, int rowAnnotations) throws java.io.IOException {
    if (hasHeader) {
        return new org.jebtk.math.matrix.CsvMatrixParser(hasHeader, rowAnnotations).parse(file);
    }else {
        return org.jebtk.math.matrix.AnnotationMatrix.parseDynamicMatrix(file, skipMatches, rowAnnotations, TextUtils.COMMA_DELIMITER);
    }
}