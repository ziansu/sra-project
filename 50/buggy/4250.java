@java.lang.Override
public void addPropertyChangeListener(org.eclipse.jface.util.IPropertyChangeListener listener) {
    org.eclipse.core.runtime.Assert.isNotNull(listener);
    if (!(propertyChangeListeners.contains(listener))) {
        propertyChangeListeners.add(listener);
    }
}