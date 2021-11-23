protected void createErrorAnnotation(org.antlr.v4.runtime.Token offendingToken, java.lang.String msg) {
    final org.eclipse.jface.text.source.Annotation annotation = new org.eclipse.jface.text.source.Annotation(PARSER_ERROR_TYPE, true, msg);
    getAnnotationModel().connect(document);
    getAnnotationModel().addAnnotation(annotation, new org.eclipse.jface.text.Position(offendingToken.getStartIndex(), (((offendingToken.getCharPositionInLine()) + ((offendingToken.getStopIndex()) - (offendingToken.getStartIndex()))) + 1)));
    getAnnotationModel().disconnect(document);
}