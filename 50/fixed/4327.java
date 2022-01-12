public javafx.beans.property.Property<T> property() {
    if ((property) == null) {
        property = propertyFactory.get();
        property.setValue(value);
    }
    return property;
}