public org.soippo.entity.User saveUser(org.soippo.entity.User user) throws org.soippo.exceptions.UserValidationException {
    if (((user.getId()) != null) && ((userRepository.findOne(user.getId())) == null)) {
        if (!(checkUniqueEmail(user.getEmail()))) {
            throw new org.soippo.exceptions.NotUniqueEmailException();
        }
        if (!(checkUniqueUser(user))) {
            throw new org.soippo.exceptions.NotUniqueUserException();
        }
    }
    return userRepository.save(user);
}