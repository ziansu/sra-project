@java.lang.Override
protected void doStore() {
    java.lang.System.out.println(("Storing " + (value)));
    getPreferenceStore().setValue(getPreferenceName(), value);
}