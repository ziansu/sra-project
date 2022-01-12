@java.lang.Override
public void markToRemoveUser(java.lang.String user) {
    if (usersData.containsKey(user))
        usersData.put(user, new at.bitfire.davdroid.crypto.SimpleUsersManager.UserState(usersData.get(user).secret, false, true, usersData.get(user).pbKey, usersData.get(user).encSK, usersData.get(user).signature));
    
    needsRemoval = true;
}