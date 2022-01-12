private void addUser(java.lang.String userID, kml.objects.User u) {
    this.userDatabase.put(userID, u);
    console.printInfo((("User " + (u.getDisplayName())) + (this.userDatabase.containsKey(userID) ? " updated." : " loaded.")));
}