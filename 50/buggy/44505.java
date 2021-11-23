protected void finalize() {
    shortcutDirectory.deleteObserver(this);
    iconDirectory.deleteObserver(this);
}