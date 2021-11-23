@java.lang.SuppressWarnings(value = "unchecked")
public org.apache.wicket.model.IModel<T> getModel(org.apache.wicket.model.IModel<T> itemModel) {
    java.lang.Object value = getPropertyValue(((T) (itemModel.getObject())));
    if (value instanceof org.apache.wicket.model.IModel) {
        return ((org.apache.wicket.model.IModel<T>) (value));
    }else {
        return new org.apache.wicket.model.Model(((java.io.Serializable) (value)));
    }
}