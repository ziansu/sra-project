public void modifyUser(long id, main.UserProfile user) {
    org.hibernate.Transaction transaction = session.beginTransaction();
    main.UserProfile oldUser = session.load(main.UserProfile.class, id);
    oldUser.setPassword(user.getPassword());
    oldUser.setEmail(user.getEmail());
    transaction.commit();
}