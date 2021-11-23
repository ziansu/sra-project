public org.xine.marketplace.model.entities.User saveUser(final org.xine.marketplace.model.entities.User user) {
    return this.manager.merge(user);
}