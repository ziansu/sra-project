private void suppressMultipleLogs(boolean isState, java.util.concurrent.atomic.AtomicBoolean wasState, java.lang.String positive, java.lang.String negative) {
    if (isState) {
        if (!(wasState.get()))
            android.util.Log.d(de.fuberlin.service.NetworkService.LOG_TAG, positive);
        
        wasState.set(true);
    }else {
        if (wasState.get())
            android.util.Log.d(de.fuberlin.service.NetworkService.LOG_TAG, negative);
        
        wasState.set(false);
    }
}