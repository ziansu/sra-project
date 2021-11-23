protected void initialiseIfInitialisable(java.lang.Object candidate) throws org.mule.api.lifecycle.InitialisationException {
    org.mule.api.lifecycle.LifecycleUtils.initialiseIfNeeded(candidate, true, muleContext);
}