@java.lang.Override
public boolean onRespond(java.lang.String response, de.prismatikremote.hartz.prismatikremote.backend.Communicator.OnCompleteListener listener) {
    java.lang.String prefix = "countleds:";
    if (response.contains(prefix)) {
        int ledCount = java.lang.Integer.valueOf(response.substring(((response.indexOf(prefix)) + (prefix.length()))));
        de.prismatikremote.hartz.prismatikremote.backend.RemoteState.getInstance().setCountLeds(ledCount);
        return true;
    }
    return false;
}