public boolean allow(java.lang.Object receivingModelElement, java.lang.Object droppedObject) {
    if ((droppedObject instanceof org.eclipse.vorto.core.api.repository.ModelResource) && (targetClass.isInstance(receivingModelElement))) {
        org.eclipse.vorto.core.api.repository.ModelResource model = ((org.eclipse.vorto.core.api.repository.ModelResource) (droppedObject));
        return (model.getId().getModelType()) == (modelType);
    }else {
        if ((droppedObject instanceof org.eclipse.vorto.core.api.repository.ModelResource) && (!(targetClass.isInstance(receivingModelElement)))) {
            org.eclipse.vorto.core.ui.MessageDisplayFactory.getMessageDisplay().displayError("Please create a Project first before dropping models from the repository.");
        }
        return false;
    }
}