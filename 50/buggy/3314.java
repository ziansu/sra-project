protected void bindImpl() {
    getContext().bindService(createServiceIntent().setAction(IpcConstant.ACTION_MESSAGE_SERVICE), (mMessageServiceConn = new com.heaven7.android.ipc.RemoteMessageContext.MessageServiceConnectionImpl()), Context.BIND_AUTO_CREATE);
}