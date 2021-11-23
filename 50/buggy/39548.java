public synchronized void unlink(gov.nasa.worldwind.View view) {
    view.removePropertyChangeListener(AVKey.VIEW, this);
    views.add(view);
}