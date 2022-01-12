@java.lang.Override
public void authUser(java.lang.String user) {
    if (usersData.containsKey(user))
        usersData.put(user, new at.bitfire.davdroid.crypto.SimpleUsersManager.UserState(usersData.get(user).secret, true, false, usersData.get(user).pbKey, usersData.get(user).encSK, usersData.get(user).signature));
    
}