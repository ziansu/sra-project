@java.lang.Override
@javax.transaction.Transactional
public void update(com.dmmsoft.user.User user) {
    com.dmmsoft.user.User userToUpdate = em.find(com.dmmsoft.user.User.class, user.getId());
    userToUpdate.setFavourites(user.getFavourites());
    em.merge(userToUpdate);
    em.flush();
}