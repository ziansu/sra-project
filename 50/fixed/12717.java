protected void removeUser() {
    model.db.UserCollection userCollection = new model.db.UserCollection();
    userCollection.removeUser("test user");
    userCollection.submit();
}