public void updateUserBalance(java.lang.Integer userID, java.lang.Double balance) {
    main.unsolidwinner.model.User user = em.find(main.unsolidwinner.model.User.class, userID);
    em.getTransaction().begin();
    user.setBalance(balance);
    em.getTransaction().commit();
}