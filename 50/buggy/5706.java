public com.mportal.ec.model.User createUser(java.lang.String username, java.lang.String email, java.lang.String password) {
    com.mportal.ec.model.User user = new com.mportal.ec.model.User(username, email, encoder.encode(password));
    return userRepository.save(user);
}