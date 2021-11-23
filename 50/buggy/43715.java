public dev.blunch.blunch.domain.User createNewUser(dev.blunch.blunch.domain.User user) {
    user.setId(user.getId().split("\\.")[0]);
    return userRepository.update(user);
}