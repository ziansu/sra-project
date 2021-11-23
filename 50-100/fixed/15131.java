@java.lang.Override
@javax.transaction.Transactional
public void update(com.dmmsoft.user.User user) {
    com.dmmsoft.user.User userToUpdate = em.find(com.dmmsoft.user.User.class, user.getId());
    userToUpdate.setFavourites(user.getFavourites());
    userToUpdate.setFavouriteInvestmentIndicators(user.getFavouriteInvestmentIndicators());
    userToUpdate.setComparisonContainers(user.getComparisonContainers());
    userToUpdate.setAdmin(user.getAdmin());
    em.merge(userToUpdate);
}