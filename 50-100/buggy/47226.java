public void registerReadyEvent(com.kaltura.playersdk.PlayerViewController.ReadyEventListener listener) {
    if (mIsJsCallReadyRegistration) {
        listener.handler();
    }else {
        if (((mCallBackReadyRegistrations) == null) && (listener != null)) {
            mCallBackReadyRegistrations = new java.util.ArrayList<com.kaltura.playersdk.PlayerViewController.ReadyEventListener>();
            mCallBackReadyRegistrations.add(listener);
        }
    }
}