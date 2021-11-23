@java.lang.Override
public boolean onRespond(java.lang.String response, de.prismatikremote.hartz.prismatikremote.backend.Communicator.OnCompleteListener listener) {
    java.lang.String prefix = "profiles:";
    if (response.contains(prefix)) {
        response = response.substring((((response.indexOf(prefix)) + (prefix.length())) + 1));
        java.util.ArrayList<java.lang.String> list = new java.util.ArrayList(java.util.Arrays.asList(response.split(";")));
        de.prismatikremote.hartz.prismatikremote.backend.RemoteState.getInstance().setProfiles(list);
        return true;
    }
    return false;
}