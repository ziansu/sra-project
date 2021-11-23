@java.lang.Override
public java.util.List<com.sf.unittest.model.User> addUser(com.sf.unittest.model.User user) {
    userRepository.save(user);
    return null;
}