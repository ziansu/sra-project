@java.lang.Override
protected void doLoad() {
    updateCombo(getPreferenceStore().getInt(getPreferenceName()));
}