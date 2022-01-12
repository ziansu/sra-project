@java.lang.Override
public void commit() {
    if ((myCsvSettings) != null) {
        myCsvSettings.applyChanges(false);
    }
}