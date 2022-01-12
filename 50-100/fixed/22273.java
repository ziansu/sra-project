@java.lang.Override
public void beforeSend(fr.loria.score.jupiter.model.Message message) {
    log.fine("Before send");
    fr.loria.score.jupiter.tree.operation.TreeOperation operation = ((fr.loria.score.jupiter.tree.operation.TreeOperation) (message.getOperation()));
    org.xwiki.gwt.wysiwyg.client.plugin.rt.dom.operation.DomOperation domOperation = domOperationFactory.createDomOperation(operation, false);
    if (domOperation != null) {
        applySelection(domOperation.execute(((org.xwiki.gwt.dom.client.Document) (nativeNode.getOwnerDocument()))));
    }else {
        updateDOM();
    }
}