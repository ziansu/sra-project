@java.lang.Override
public void finish() {
    mController.onSaveInstanceState(null);
    super.finish();
    java.lang.System.exit(0);
}