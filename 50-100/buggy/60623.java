@java.lang.Override
public com.levserj.domain.User updateUser(com.levserj.domain.User user) {
    if (!(repository.exists(user.getId()))) {
        com.levserj.service.mysql.MySQLUserService.LOG.error("User with id: {} doesn't exist", user.getId());
        throw new java.util.NoSuchElementException(("No such user: " + (user.getId())));
    }
    return repository.save(user);
}