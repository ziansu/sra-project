protected void fireInvalidate(javafx.beans.Observable observable) {
    org.marid.jfx.beans.FxCleaner.clean(listeners);
    listeners.forEach(( l) -> l.invalidated(observable));
}