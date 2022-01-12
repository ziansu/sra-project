void loadUsers() {
    java.sql.ResultSet users = db.execute("select * from users;");
    try {
        while (users.next()) {
            java.lang.String name = users.getString("name");
            java.lang.String email = users.getString("email");
            java.lang.String password = users.getString("password");
            Albergo.User user = new Albergo.Customer(0, name, email, password);
            this.users.add(user);
        } 
    } catch (java.lang.Exception e) {
        Albergo.CLI.println("Error loading users!");
    }
}