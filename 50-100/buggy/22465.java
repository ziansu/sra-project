@java.lang.Override
public de.mhus.lib.core.strategy.OperationResult doExecute(de.mhus.lib.core.IProperties editorProperties, com.vaadin.ui.Component editor) throws java.lang.Exception {
    if ((editor == null) || (!(editor instanceof de.mhus.lib.vaadin.operation.AbstractVaadinOperationEditor)))
        throw new de.mhus.lib.errors.UsageException("editor need to be a AbstractVaadinOperationEditor");
    
    ((de.mhus.lib.vaadin.operation.AbstractVaadinOperationEditor) (editor)).fillOperationParameters(editorProperties);
    de.mhus.lib.core.strategy.DefaultTaskContext context = new de.mhus.lib.core.strategy.DefaultTaskContext(this.getClass());
    context.setParameters(editorProperties);
    return doExecute2(context);
}