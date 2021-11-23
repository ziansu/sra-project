protected void bindImpl() {
    getContext().bindService(createServiceIntent(new android.content.Intent(IpcConstant.ACTION_MESSAGE_SERVICE)), (mMessageServiceConn = new com.heaven7.android.ipc.RemoteMessageContext.MessageServiceConnectionImpl()), Context.BIND_AUTO_CREATE);
}