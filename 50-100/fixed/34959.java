com.individual.thinking.traitorstown.user.User login(java.lang.String email, java.lang.String password) throws java.lang.Exception {
    java.util.Optional<com.individual.thinking.traitorstown.user.User> user = userRepository.findByEmail(email);
    if (!(user.isPresent())) {
        throw new com.individual.thinking.traitorstown.user.exceptions.UserNotFoundException("User not found");
    }
    if (!(com.individual.thinking.traitorstown.user.encryption.Secure.check(password, user.get().getPassword()))) {
        throw new com.individual.thinking.traitorstown.user.exceptions.IncorrectPasswordException("Password incorrect");
    }
    return user.get();
}