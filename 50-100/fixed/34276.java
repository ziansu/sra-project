@org.springframework.messaging.handler.annotation.MessageMapping(value = "/chat.private.{username}")
public void filterPrivateMessage(org.springframework.messaging.Message message, @org.springframework.messaging.handler.annotation.Payload
com.tempest.moonlight.server.domain.ChatMessage chatMessage, @org.springframework.messaging.handler.annotation.DestinationVariable(value = "username")
java.lang.String username, java.security.Principal principal) {
    if (!(org.springframework.util.StringUtils.hasText(username))) {
        throw new com.tempest.moonlight.server.exceptions.InvalidUserLoginException(username);
    }
    if (!(userService.checkUserExists(username))) {
        throw new com.tempest.moonlight.server.exceptions.UserDoesNotExistException(username);
    }
    checkProfanityAndSanitize(chatMessage);
    messageService.saveMessage(com.tempest.moonlight.server.util.ChatMessageUtil.setUpMessage(chatMessage, principal, username, message));
    simpMessagingTemplate.convertAndSend((("/user/" + username) + "/queue/chat.message"), chatMessage);
}