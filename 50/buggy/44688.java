@java.lang.Override
public void onStart() {
    super.onStart();
    connectionThread = new com.sga.master.sgamaster.MainMasterActivity.ClientConnector();
    connectionThread.start();
}