@java.lang.Override
public void onStart() {
    super.onStart();
    getSyncService().addListener(dataListener);
}