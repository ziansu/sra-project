@java.lang.Override
public boolean remove(final org.escidoc.browser.model.ResourceModel resourceModel) {
    com.google.common.base.Preconditions.checkNotNull(resourceModel, "resourceModel is null: %s", resourceModel);
    if ((((resourceModel.getType().toString()) == "ITEM") || ((resourceModel.getType().toString()) == "CONTAINER")) || ((resourceModel.getType().toString()) == "CONTEXT")) {
        return dataSource.removeItem(resourceModel);
    }else {
        throw new java.lang.UnsupportedOperationException("Not yet implemented");
    }
}