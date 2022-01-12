public boolean addUser(edu.gatech.cs2340.thericks.models.User u) {
    if (u.getLogin().isValid()) {
        users.add(u);
        android.util.Log.d("Login", ("Added new user: " + (u.getUsername())));
        return true;
    }else {
        return false;
    }
}