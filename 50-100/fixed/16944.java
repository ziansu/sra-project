public static <T> javafx.beans.value.ChangeListener<T> replaceListenerIfExists(javafx.beans.value.ChangeListener<T> listener, javafx.beans.value.ChangeListener<T> replacement, javafx.beans.property.Property<T> property) {
    if (listener != null) {
        property.removeListener(listener);
    }
    property.addListener(replacement);
    return replacement;
}