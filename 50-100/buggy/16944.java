public static <T> void replaceListenerIfExists(javafx.beans.value.ChangeListener<T> listener, javafx.beans.value.ChangeListener<T> replacement, javafx.beans.property.Property<T> property) {
    if (listener != null) {
        property.removeListener(listener);
    }
    listener = replacement;
    property.addListener(listener);
}