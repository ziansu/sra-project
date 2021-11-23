private void listenForHalfMode(boolean listen) {
    if ((!(mUseAccelerometer)) || (mDozeParameters.getFullMode()))
        return ;
    
    if (listen && (mDozeParameters.getHalfMode())) {
        if ((mProximitySensorManager) != null)
            mProximitySensorManager.enable();
        
    }else {
        if ((mProximitySensorManager) != null)
            mProximitySensorManager.disable(true);
        
    }
}