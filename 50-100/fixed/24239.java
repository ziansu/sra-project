@javax.annotation.PostConstruct
private void init() {
    com.yukthi.webutils.repository.IUserRepository userRepository = repositoryFactory.getRepository(com.yukthi.webutils.repository.IUserRepository.class);
    com.yukthi.webutils.repository.UserEntity user = userRepository.fetchUser("admin", "admin");
    if (user != null) {
        this.userId = user.getId();
        return ;
    }
    user = new com.yukthi.webutils.repository.UserEntity("admin", "admin", "admin");
    user.setVersion(1);
    userRepository.save(user);
    this.userId = user.getId();
}