@java.lang.Override
public de.ppi.samples.fuwesta.model.User read(java.lang.Long userId) {
    final de.ppi.samples.fuwesta.model.User user = userDao.findOne(userId);
    if (!(org.springframework.util.CollectionUtils.isEmpty(user.getPostings()))) {
        user.getPostings().size();
    }
    return user;
}