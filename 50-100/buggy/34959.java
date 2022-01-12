com.individual.thinking.traitorstown.user.User login(java.lang.String email, java.lang.String password) throws com.individual.thinking.traitorstown.user.exceptions.IncorrectPasswordException, com.individual.thinking.traitorstown.user.exceptions.UserNotFoundException {
    java.util.Optional<com.individual.thinking.traitorstown.user.User> user = userRepository.findByEmail(email);
    if (!(user.isPresent())) {
        throw new com.individual.thinking.traitorstown.user.exceptions.UserNotFoundException("User not found");
    }
    try {
        if (com.individual.thinking.traitorstown.user.encryption.Secure.check(password, user.get().getPassword()))
            return user.get();
        
    } catch (java.lang.Exception e) {
        throw new com.individual.thinking.traitorstown.user.exceptions.IncorrectPasswordException("Password incorrect", e);
    }
    return null;
}