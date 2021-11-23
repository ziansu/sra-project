@java.lang.Override
public void stream(org.codehaus.staxmate.in.SMHierarchicCursor rootCursor) throws javax.xml.stream.XMLStreamException {
    rootCursor.advance();
    org.sonar.plugins.flex.cobertura.CoberturaReportPasrer.collectPackageMeasures(rootCursor.descendantElementCursor("package"), context, project, fileSystem);
}