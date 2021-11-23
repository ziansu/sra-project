@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.room.apollo.server.entity.User user1 = new org.room.apollo.server.entity.User("login", PASSWORD, TEST_EMAIL_1);
    org.room.apollo.server.entity.User user2 = new org.room.apollo.server.entity.User("name", PASSWORD, TEST_EMAIL_2);
    users.add(user1);
    users.add(user2);
    org.room.apollo.server.entity.Room room = new org.room.apollo.server.entity.Room("test", users, null);
    org.junit.Assert.assertNull(room.getId());
    this.mongoRepository.save(room);
    org.junit.Assert.assertNotNull(room);
}