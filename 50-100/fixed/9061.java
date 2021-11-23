@java.lang.Override
protected void onResume() {
    super.onResume();
    com.example.mirko.custombuttonexample.CastConnectionManager manager = com.example.mirko.custombuttonexample.PartyCastApplication.getInstance().getCastConnectionManager();
    manager.startScan();
    manager.addObserver(this);
    if (manager.isConnectedToReceiver()) {
        com.example.mirko.custombuttonexample.PartyCastApplication.getInstance().getCastConnectionManager().getGameManagerClient().setListener(mListener);
    }
}