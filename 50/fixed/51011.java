@java.lang.Override
public void removeListener(javafx.beans.InvalidationListener listener) {
    listeners.remove(listener);
    org.marid.jfx.beans.FxCleaner.clean(listeners);
}