@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    io.bookster.domain.User user = ((io.bookster.domain.User) (o));
    return login.equals(user.login);
}