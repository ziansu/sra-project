public User requestPasswordReset(java.lang.String mail) {
    User user = userRepository.findOneByEmail(mail);
    if ((user != null) && (user.getActivated())) {
        user.setResetKey(RandomUtil.generateResetKey());
        user.setResetDate(org.joda.time.DateTime.now());
        userRepository.save(user);
        return user;
    }
    return user;
}