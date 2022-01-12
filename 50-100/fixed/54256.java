@javax.annotation.PostConstruct
public void initializeDb() {
    java.lang.String password = passwordEncoder.encode("password");
    if ((userRepository.findOne(1L)) == null) {
        userRepository.save(new org.NeilAlishev.blockchain.model.User("Ivan", "employee", password, org.NeilAlishev.blockchain.model.enums.Role.EMPLOYEE));
        userRepository.save(new org.NeilAlishev.blockchain.model.User("Vagiz", "employer", password, org.NeilAlishev.blockchain.model.enums.Role.EMPLOYER));
        userRepository.save(new org.NeilAlishev.blockchain.model.User("Rustem", "admin", password, org.NeilAlishev.blockchain.model.enums.Role.ADMIN));
    }
}