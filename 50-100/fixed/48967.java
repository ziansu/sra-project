public boolean login(java.lang.String id, java.lang.String password) {
    if ((this.studentCollection.get(id)) != null) {
        if ((this.studentCollection.get(id).getPassword()) == (java.lang.Integer.parseInt(password))) {
            java.lang.System.out.println(java.lang.Integer.parseInt(password));
            return true;
        }
    }
    return false;
}