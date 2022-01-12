@java.lang.Override
public boolean remove(final org.escidoc.browser.model.ResourceModel resourceModel) {
    com.google.common.base.Preconditions.checkNotNull(resourceModel, "resourceModel is null: %s", resourceModel);
    if (((resourceModel.getType().equals("ITEM")) || (resourceModel.getType().equals("CONTAINER"))) || (resourceModel.getType().equals("CONTEXT"))) {
        return dataSource.removeItem(resourceModel);
    }else {
        throw new java.lang.UnsupportedOperationException("Not yet implemented");
    }
}