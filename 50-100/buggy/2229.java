@java.lang.Override
public void unenlistAsRolePlayerForContext(final java.lang.String roleName, final info.fulloo.trygve.run_time.RTObjectCommon.RTContextObject contextInstance) {
    if (rolesIAmPlayingInContext_.containsKey(contextInstance)) {
        final java.util.List<java.lang.String> rolesIAmPlayingHere = rolesIAmPlayingInContext_.get(contextInstance);
        rolesIAmPlayingHere.remove(roleName);
        if (0 == (rolesIAmPlayingHere.size())) {
            rolesIAmPlayingInContext_.remove(contextInstance);
        }
    }else {
        assert false;
    }
}