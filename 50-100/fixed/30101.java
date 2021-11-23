public static org.jebtk.math.matrix.AnnotationMatrix parseTxtMatrix(java.nio.file.Path file, boolean hasHeader, java.util.List<java.lang.String> skipMatches, int rowAnnotations, java.lang.String delimiter) throws java.io.IOException {
    if (hasHeader) {
        return new org.jebtk.math.matrix.MixedMatrixParser(hasHeader, skipMatches, rowAnnotations, delimiter).parse(file);
    }else {
        return org.jebtk.math.matrix.AnnotationMatrix.parseDynamicMatrix(file, skipMatches, rowAnnotations, delimiter);
    }
}