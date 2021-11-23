@java.lang.Override
protected void doStore() {
    getPreferenceStore().setValue(getPreferenceName(), value);
}