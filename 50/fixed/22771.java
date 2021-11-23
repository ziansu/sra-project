public void fireChange(final T t) {
    for (final com.snap252.vaadin.pivot.xml.data.ChangeListener<T> listChangeListener : new java.util.LinkedList(listChangeListeners)) {
        listChangeListener.changed(t);
    }
}