@java.lang.Override
public boolean canExecute() {
    if (!(super.canExecute())) {
        return false;
    }
    if ((!((this.getSourceModel()) instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.note.WalkerNote)) && (!((this.getTargetModel()) instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.note.WalkerNote))) {
        return false;
    }
    return true;
}