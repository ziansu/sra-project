@java.lang.Override
public ru.javawebinar.topjava.AuthorizedUser loadUserByUsername(java.lang.String email) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    ru.javawebinar.topjava.model.User u = repository.getByEmail(email.toLowerCase());
    if (u == null) {
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException((("User " + email) + " is not found"));
    }
    return new ru.javawebinar.topjava.AuthorizedUser(u);
}