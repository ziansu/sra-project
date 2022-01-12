public void handle(server.Conversation conversation) {
    if (conversation.getRequestedURI().startsWith("/docent/absentienoteren/lessen")) {
        lessenOphalen(conversation);
    }else
        if (conversation.getRequestedURI().startsWith("/docent/absentienoteren/ophalen")) {
            ophalen(conversation);
        }
    
}