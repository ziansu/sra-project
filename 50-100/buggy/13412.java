@java.lang.Override
public void addToLastHeartbeat(java.lang.String user, float elapsedTime) {
    for (int i = 0; i < (userInfo.size()); i++) {
        if ((userInfo.get(i).username) == user) {
            userInfo.get(i).lastHeartbeat += elapsedTime;
            break;
        }
    }
}