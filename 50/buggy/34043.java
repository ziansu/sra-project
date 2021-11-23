@java.lang.Override
public int insertUser(appl.data.items.User user) throws exceptions.data.PrimaryKeyViolation {
    java.lang.Integer id = ((java.lang.Integer) (getSession().save(user)));
    java.lang.System.out.println(("Alle user: " + (getUsers())));
    return id;
}