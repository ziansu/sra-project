@java.lang.Override
public void onApplicationEvent(org.springframework.web.socket.messaging.SessionDisconnectEvent event) {
    org.exampleapps.greatbig.web.websocket.dto.MessageDTO messageDTO = new org.exampleapps.greatbig.web.websocket.dto.MessageDTO();
    messagingTemplate.convertAndSend("/topic/message", messageDTO);
}