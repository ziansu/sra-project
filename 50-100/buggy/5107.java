public java.lang.String fix(java.lang.String xml) {
    elaborate.editor.export.mvn.TextDecorationVisitor visitor = new elaborate.editor.export.mvn.TextDecorationVisitor();
    nl.knaw.huygens.tei.Document document = nl.knaw.huygens.tei.Document.createFromXml(xml, false);
    document.accept(visitor);
    java.lang.String textDecorationFixed = visitor.getContext().getResult();
    nl.knaw.huygens.Log.info("textDecorationFixed={}", textDecorationFixed);
    elaborate.editor.export.mvn.AnnotationHierarchyVisitor ahVisitor = new elaborate.editor.export.mvn.AnnotationHierarchyVisitor();
    document = nl.knaw.huygens.tei.Document.createFromXml((("<body>" + textDecorationFixed) + "</body>"), false);
    textDecorationFixed = traverse(document);
    return textDecorationFixed;
}