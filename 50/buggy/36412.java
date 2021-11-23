@java.lang.Override
protected void doLoad() {
    java.lang.System.out.println("Loading current ");
    updateCombo(getPreferenceStore().getInt(getPreferenceName()));
}