@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (!(obj instanceof ru.spaceinvasion.User)) {
        return false;
    }
    final ru.spaceinvasion.User user = ((ru.spaceinvasion.User) (obj));
    return ((password.equals(user.password)) && (password.equals(user.password))) && (email.equals(user.email));
}