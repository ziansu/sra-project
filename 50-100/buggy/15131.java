@java.lang.Override
@javax.transaction.Transactional
public void update(com.dmmsoft.user.User user) {
    com.dmmsoft.user.User userToUpdate = em.find(com.dmmsoft.user.User.class, user.getId());
    userToUpdate.setFavourites(user.getFavourites());
    userToUpdate.setFavouriteInvestmentIndicators(user.getFavouriteInvestmentIndicators());
    userToUpdate.setAdmin(user.getAdmin());
    userToUpdate.setComparisonContainers(user.getComparisonContainers());
    em.merge(userToUpdate);
}