private void addUser(kml.objects.User u) {
    if (this.userDatabase.contains(u)) {
        this.userDatabase.remove(u);
        this.userDatabase.add(u);
        console.printInfo((("User " + (u.getDisplayName())) + " updated."));
    }else {
        this.userDatabase.add(u);
        console.printInfo((("User " + (u.getDisplayName())) + " loaded."));
    }
}