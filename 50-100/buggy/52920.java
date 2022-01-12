@java.lang.Override
public void afterReceive(fr.loria.score.jupiter.model.Message receivedMessage) {
    log.fine(("Executing received: " + receivedMessage));
    fr.loria.score.jupiter.tree.operation.TreeOperation operation = ((fr.loria.score.jupiter.tree.operation.TreeOperation) (receivedMessage.getOperation()));
    org.xwiki.gwt.wysiwyg.client.plugin.rt.dom.operation.DomOperation domOperation = domOperationFactory.createDomOperation(operation);
    if (domOperation != null) {
        fr.loria.score.jupiter.tree.operation.TreeOperation[] selectionEndPoints = saveSelection();
        domOperation.execute(((org.xwiki.gwt.dom.client.Document) (nativeNode.getOwnerDocument())));
        restoreSelection(selectionEndPoints, operation);
    }else {
        updateDOM();
    }
}