@org.junit.Before
public void setUp() throws java.lang.Exception {
    ru.urfu.entities.User user = new ru.urfu.entities.User(testUserLogin, testUserPassword);
    usersStorage.add(user);
    addedMessagesIds = new java.util.ArrayList<>();
    addedMessagesIds.add(messagesStorage.add(new ru.urfu.entities.Message(0L, "Первое тест сообщение", user)).getId());
    addedMessagesIds.add(messagesStorage.add(new ru.urfu.entities.Message(1L, "Второе тест сообщение", user)).getId());
}