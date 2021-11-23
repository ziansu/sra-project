@java.lang.Override
public boolean updateState() {
    try {
        com.vulture.libvulture.model.VultureUserData data = com.vulture.libvulture.ApiClient.getUserData(username, password);
        if (data != null) {
            transfer = data.getTransfer();
            transfer_limit = data.transfer_limit;
            inviter = data.inviter;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return false;
}