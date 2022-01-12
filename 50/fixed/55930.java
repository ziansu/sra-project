public com.softserve.academy.spaced.repetition.service.User setUsersStatusBlocked(java.lang.Long id) {
    com.softserve.academy.spaced.repetition.service.User user = userRepository.findOne(id);
    user.getAccount().setStatus(AccountStatus.BLOCKED);
    userRepository.save(user);
    return user;
}