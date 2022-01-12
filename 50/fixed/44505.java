protected void finalize() throws java.lang.Throwable {
    try {
        shortcutDirectory.deleteObserver(this);
        iconDirectory.deleteObserver(this);
    } finally {
        super.finalize();
    }
}