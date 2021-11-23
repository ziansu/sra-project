public java.lang.String fix(java.lang.String xml) {
    elaborate.editor.export.mvn.TextDecorationVisitor visitor = new elaborate.editor.export.mvn.TextDecorationVisitor();
    nl.knaw.huygens.tei.Document document = nl.knaw.huygens.tei.Document.createFromXml(xml, false);
    document.accept(visitor);
    java.lang.String textDecorationFixed = visitor.getContext().getResult();
    document = nl.knaw.huygens.tei.Document.createFromXml(textDecorationFixed, false);
    return traverse(document);
}