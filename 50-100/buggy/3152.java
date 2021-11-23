@java.lang.Override
public boolean onRespond(java.lang.String response, de.prismatikremote.hartz.prismatikremote.backend.Communicator.OnCompleteListener listener) {
    java.lang.String prefix = "profile:";
    if (response.contains(prefix)) {
        java.lang.String profile = response.substring((((response.indexOf(prefix)) + (prefix.length())) + 1));
        de.prismatikremote.hartz.prismatikremote.backend.RemoteState.getInstance().setProfile(profile);
        return true;
    }
    return false;
}