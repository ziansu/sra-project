private void renderElement(zildo.fwk.script.command.ScriptProcess process, zildo.fwk.script.xml.element.action.runtime.RuntimeAction currentNode, boolean moveCursor) {
    if (!(currentNode.var)) {
        renderAction(process, currentNode, moveCursor);
    }else {
        renderVariable(process, currentNode, moveCursor);
    }
}