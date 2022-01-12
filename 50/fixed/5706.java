public void createUser(java.lang.String username, java.lang.String email, java.lang.String password) {
    userRepository.save(new com.mportal.ec.model.User(username, email, encoder.encode(password)));
}