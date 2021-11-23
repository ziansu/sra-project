private void listenForHalfMode(boolean listen) {
    if ((!(mUseAccelerometer)) || (mDozeParameters.getFullMode()))
        return ;
    
    if (listen && (mDozeParameters.getHalfMode())) {
        mProximitySensorManager.enable();
    }else {
        mProximitySensorManager.disable(true);
    }
}