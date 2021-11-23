@java.lang.Override
public void enlistAsStagePropPlayerForContext(final java.lang.String stagePropName, final info.fulloo.trygve.run_time.RTObjectCommon.RTContextObject contextInstance) {
    assert null != contextInstance;
    java.util.List<java.lang.String> stagePropsIAmPlayingHere = null;
    if (stagePropsIAmPlayingInContext_.containsKey(contextInstance)) {
        stagePropsIAmPlayingHere = stagePropsIAmPlayingInContext_.get(contextInstance);
    }else {
        stagePropsIAmPlayingHere = new java.util.ArrayList<java.lang.String>();
        stagePropsIAmPlayingInContext_.put(contextInstance, stagePropsIAmPlayingHere);
    }
    stagePropsIAmPlayingHere.add(stagePropName);
}