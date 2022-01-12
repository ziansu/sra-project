@java.lang.Override
public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(java.lang.String username) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    ru.strela.model.auth.Person person = personService.findByLogin(new ru.strela.model.auth.Person(username.trim()));
    if (person == null)
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException((("User " + username) + " not found"));
    
    return new ru.strela.auth.AuthPerson(person);
}