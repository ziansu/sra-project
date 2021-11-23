public org.xine.marketplace.model.entities.User saveUser(final org.xine.marketplace.model.entities.User user) {
    this.manager.merge(user);
    return user;
}