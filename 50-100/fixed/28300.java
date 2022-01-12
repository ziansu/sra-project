@java.lang.Override
public boolean isOnline(java.lang.String friend) {
    boolean isOnline = false;
    for (int i = 0; i < (userInfo.size()); i++) {
        if (friend.equals(userInfo.get(i).username)) {
            if ((userInfo.get(i).ip) != null) {
                isOnline = true;
                break;
            }
        }
    }
    return isOnline;
}