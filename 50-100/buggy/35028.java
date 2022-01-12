public boolean authenticateUser(java.lang.String UserName) {
    for (int i = 0; i < (ca.ualberta.cs.cmput301w15t12.UserList.users.size()); ++i) {
        if (ca.ualberta.cs.cmput301w15t12.UserList.users.get(i).getUserName().equals(UserName)) {
            return true;
        }
        return false;
    }
}