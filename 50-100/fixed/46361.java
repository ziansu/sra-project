@java.lang.Override
public boolean canExecute() {
    if (!(super.canExecute())) {
        return false;
    }
    if ((!((getSourceModel()) instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.note.WalkerNote)) && (!((getTargetModel()) instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.note.WalkerNote))) {
        return false;
    }
    return true;
}