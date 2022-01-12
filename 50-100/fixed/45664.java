@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public com.amadeusounds.model.User registerUser(com.amadeusounds.model.User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    user.setSongs(new java.util.ArrayList<>());
    user.setComments(new java.util.ArrayList<>());
    user.setRatings(new java.util.ArrayList<>());
    userRepository.saveAndFlush(user);
    return user;
}