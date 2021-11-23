public void fireChange(final T t) {
    for (final com.snap252.vaadin.pivot.xml.data.ChangeListener<T> listChangeListener : listChangeListeners) {
        listChangeListener.changed(t);
    }
}