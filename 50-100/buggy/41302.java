private void addUser(kml.objects.User u) {
    console.printInfo((("User " + (u.getDisplayName())) + (this.userDatabase.contains(u) ? " updated." : " loaded.")));
    this.userDatabase.add(u);
}