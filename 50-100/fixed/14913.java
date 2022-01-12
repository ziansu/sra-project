public void registerUser(java.lang.String fname, java.lang.String lname, java.lang.String username, java.lang.String email, java.lang.String mobilenumber, java.lang.String dob, java.lang.String gender, java.lang.String password) {
    connect.addUser(username, password, 0, 2);
    connect.addUserDetails(connect.getUser(username, 2).getID(), fname, lname, email, mobilenumber, dob, gender);
}