@org.junit.Test
public void testAddUser() {
    userRepository.addUser("sadvit", "sadvit", Role.USER);
    userRepository.addUser("mrsadvit", "sadvit", Role.USER);
}