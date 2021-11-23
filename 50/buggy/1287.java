@java.lang.Override
public void finish() {
    mEditorSettings.putInt("cityFilter", selectedIndex);
    mEditorSettings.commit();
    super.finish();
}