public com.ct.dao.UserDAO updateUserSubscription(com.ct.dao.UserDAO updateUserDAO, java.lang.String userId) {
    com.ct.dao.UserDAO user = new com.ct.dao.UserDAO();
    java.lang.System.out.println("In update user SUBSCRIPTION");
    user = userDetailsRepo.findOne(userId);
    user.setSendNotifications(updateUserDAO.isSendNotifications());
    user.setSendRecommendations(updateUserDAO.isSendRecommendations());
    user.setSubscriptionList(updateUserDAO.getSubscriptionList());
    return userDetailsRepo.save(user);
}