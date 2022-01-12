@com.tech.services.chatroom.Test
@org.springframework.test.context.jdbc.Sql(scripts = "classpath:populateDB.sql")
public void testAddChatroomMember() {
    service.add(new com.tech.models.entities.chatroom.ChatroomMembers(3L, 1L));
    com.tech.services.chatroom.Assert.assertTrue("Could not add member", service.checkIfMemberExistsInChatroom(1L, 3L));
}