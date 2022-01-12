@java.lang.Override
protected void bindImpl() {
    getContext().bindService(createServiceIntent(new android.content.Intent(IpcConstant.ACTION_CLIENT_MANAGER)), (mClientManagerConn = new com.heaven7.android.ipc.MessageClient.ClientManagerConnectionImpl()), Context.BIND_AUTO_CREATE);
    super.bindImpl();
}