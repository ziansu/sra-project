public static java.lang.String authenticate(int id, java.lang.String password) {
    java.lang.System.out.println(("the id is " + id));
    models.Level level = models.Level.find.where().eq("id", id).findUnique();
    if (password.equals(level.password)) {
        return "Sucess";
    }else {
        java.lang.System.out.println("invalid auth");
        return null;
    }
}