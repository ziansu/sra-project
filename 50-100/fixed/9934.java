@java.lang.Override
public void saveUser(com.tribuo.backend.jpa.User user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    user.setActive(1);
    com.tribuo.backend.jpa.Role userRole = roleRepo.findByRole("ADMIN");
    user.setRoles(new java.util.HashSet<com.tribuo.backend.jpa.Role>(java.util.Arrays.asList(userRole)));
    usuRepo.save(user);
}