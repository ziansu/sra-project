@org.junit.Test
public void saveCredentialsSuccess() {
    credentials.setEmail(newEmail);
    credentials.setPassword(password);
    user.setEmail(email);
    user.setPassword(password);
    when(usersDAO.getUserByEmail(email)).thenReturn(user);
    when(passwordEncoder.encode(password)).thenReturn(password);
    com.tsystems.javaschool.webshop.dao.entities.User savedUser = accountService.saveCredentials(credentials, email);
    verify(usersDAO).update(user);
    assergitEquals(savedUser, user);
}