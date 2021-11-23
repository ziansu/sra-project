public model.User updateUser(model.User user) {
    return em.merge(user);
}