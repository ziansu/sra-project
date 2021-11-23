@java.lang.Override
public void unenlistAsStagePropPlayerForContext(final java.lang.String roleName, final info.fulloo.trygve.run_time.RTObjectCommon.RTContextObject contextInstance) {
    assert null != contextInstance;
    java.util.List<java.lang.String> rolesIAmPlayingHere = null;
    if (rolesIAmPlayingInContext_.containsKey(contextInstance)) {
        rolesIAmPlayingHere = rolesIAmPlayingInContext_.get(contextInstance);
        rolesIAmPlayingHere.remove(roleName);
        if (0 == (rolesIAmPlayingHere.size())) {
            rolesIAmPlayingInContext_.remove(contextInstance);
        }
    }else {
        assert false;
    }
}