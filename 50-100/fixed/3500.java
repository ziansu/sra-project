@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void save(com.bionic.domain.User user) {
    com.bionic.util.PasswordEncoder passwordEncoder = com.bionic.util.PasswordEncoder.getInstance();
    if (user != null) {
        java.lang.String password = user.getPasswordHash();
        java.lang.String salt = passwordEncoder.nextSALT();
        java.lang.String passwordHash = passwordEncoder.encode(password, salt);
        user.setPasswordHash(passwordHash);
        user.setSalt(salt);
        userDao.save(user);
    }
}