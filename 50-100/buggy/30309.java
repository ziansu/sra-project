@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof ru.spaceinvasion.User))
        return false;
    
    final ru.spaceinvasion.User user = ((ru.spaceinvasion.User) (o));
    return ((password.equals(user.password)) && (password.equals(user.password))) && (email.equals(user.email));
}