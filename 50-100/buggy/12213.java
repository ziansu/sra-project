@org.junit.Test
public void testFindByMessageAuthor() {
    in.shekhar.forumapp.domain.Message message = new in.shekhar.forumapp.domain.Message("test_user", "hello world");
    messageRepository.save(message);
    java.util.List<in.shekhar.forumapp.domain.Message> messages = messageRepository.findByMessageAuthor("test_user");
    assertNotNull(messages);
    assertFalse(messages.isEmpty());
    assertEquals(1, messages.size());
}