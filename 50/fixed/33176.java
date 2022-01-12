@java.lang.Override
protected void doExecute() {
    diagram.removeContent(element);
    org.dbflute.erflute.editor.model.ERModelUtil.refreshDiagram(diagram);
}