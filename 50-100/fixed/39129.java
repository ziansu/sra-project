private void detach(org.gradle.internal.logging.console.ProgressOperation operation) {
    if (!(isRenderable(operation))) {
        return ;
    }
    detach(operation.getOperationId());
    unassignedProgressOperations.remove(operation);
    if (((operation.getParent()) != null) && (isRenderable(operation.getParent()))) {
        attach(operation.getParent());
    }else
        if (!(unassignedProgressOperations.isEmpty())) {
            attach(unassignedProgressOperations.pop());
        }
    
}