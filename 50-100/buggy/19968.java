private void addUser(java.lang.String name) {
    java.lang.System.out.println(("    User " + name));
    java.sql.ResultSet out = execQuery((((("create (" + name) + ":User {name: \"") + name) + "\" })"));
    try {
        out.close();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}