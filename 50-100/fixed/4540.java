@java.lang.Override
public int getLastHeartbeat(java.lang.String user) {
    int lastHeartBeat = -1;
    for (int i = 0; i < (userInfo.size()); i++) {
        if (userInfo.get(i).username.equals(user)) {
            lastHeartBeat = ((int) (userInfo.get(i).lastHeartbeat));
            break;
        }
    }
    return lastHeartBeat;
}