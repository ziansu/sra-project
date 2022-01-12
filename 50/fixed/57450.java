@java.lang.SuppressWarnings(value = "unchecked")
protected org.apache.wicket.model.IModel<T> newModel(T object) {
    return ((org.apache.wicket.model.IModel<T>) (new org.apache.wicket.model.Model<java.io.Serializable>(((java.io.Serializable) (object)))));
}