public java.lang.Object getNameProperty(final T pojo) {
    final java.util.Set<?> properties = org.wirez.core.definition.adapter.binding.AbstractBindableDefinitionAdapter.getProperties(pojo);
    if ((null != properties) && (!(properties.isEmpty()))) {
        for (final java.lang.Object property : properties) {
            if (getNamePropertyClass().equals(property.getClass())) {
                return property;
            }
        }
    }
    return null;
}