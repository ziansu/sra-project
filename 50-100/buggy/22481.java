public void restrictContainerType(java.lang.Class<? extends com.vaadin.data.Container.Ordered> restrictedContainerType) {
    if ((container) != null) {
        container.getClass().isAssignableFrom(restrictedContainerType);
        throw new java.lang.IllegalStateException(((((("Cannot restrict container type to " + (restrictedContainerType.getCanonicalName())) + ":") + " a container of type ") + (container.getClass().getCanonicalName())) + " is currently attached"));
    }
    this.restrictedContainerType = restrictedContainerType;
}