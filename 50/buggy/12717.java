@org.junit.After
public void tearDown() throws java.lang.Exception {
    model.db.UserCollection userCollection = new model.db.UserCollection();
    userCollection.removeUser("test user");
    userCollection.submit();
}