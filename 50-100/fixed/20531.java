public org.apache.wicket.model.IModel<?> getModel(org.apache.wicket.model.IModel<T> itemModel) {
    java.lang.Object value = getPropertyValue(((T) (itemModel.getObject())));
    if (value instanceof org.apache.wicket.model.IModel) {
        return ((org.apache.wicket.model.IModel<?>) (value));
    }else {
        return new org.apache.wicket.model.Model<java.io.Serializable>(((java.io.Serializable) (value)));
    }
}