public void handle(server.Conversation conversation) {
    if (conversation.getRequestedURI().startsWith("/docent/absentienoteren/lessen")) {
        java.lang.System.out.println("test0");
        lessenOphalen(conversation);
    }else
        if (conversation.getRequestedURI().startsWith("/docent/absentienoteren/ophalen")) {
            java.lang.System.out.println("test 1");
            ophalen(conversation);
        }
    
}