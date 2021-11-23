public ru.javawebinar.topjava.model.User create(ru.javawebinar.topjava.model.User user) {
    user.setId(null);
    LOG.info(("create " + user));
    return service.save(user);
}