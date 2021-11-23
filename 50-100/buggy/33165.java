@java.lang.Override
public void markToRemoveUser(java.lang.String user) {
    if (usersData.containsKey(user))
        usersData.put(user, new at.bitfire.davdroid.crypto.SimpleUsersManager.UserState(usersDataSuperSet.get(user).secret, false, true, usersDataSuperSet.get(user).pbKey, usersDataSuperSet.get(user).encSK, usersDataSuperSet.get(user).signature));
    
    needsRemoval = true;
}