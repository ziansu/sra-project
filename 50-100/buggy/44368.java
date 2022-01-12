@java.lang.Override
public void authUser(java.lang.String user) {
    if (usersDataSuperSet.containsKey(user))
        usersData.put(user, new at.bitfire.davdroid.crypto.SimpleUsersManager.UserState(usersDataSuperSet.get(user).secret, true, false, usersData.get(user).pbKey, usersData.get(user).encSK, usersData.get(user).signature));
    
}