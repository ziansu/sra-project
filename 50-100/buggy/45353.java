public static void addChatSessions(javax.websocket.Session chatSession) {
    if ((prj.serenasimon.cache.ChatCache.chatSessions.get(chatSession.getUserProperties().get("room"))) == null) {
        prj.serenasimon.cache.ChatCache.chatSessions.put(((java.lang.String) (chatSession.getUserProperties().get("room"))), java.util.Arrays.asList(chatSession));
    }else {
        prj.serenasimon.cache.ChatCache.chatSessions.get(chatSession.getUserProperties().get("room")).add(chatSession);
    }
}