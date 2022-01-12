@java.lang.Override
public void onConnected(com.skyworld.cache.Token token, com.skyworld.push.ClientTerminal terminal) {
    com.skyworld.service.dsf.User user = com.skyworld.cache.CacheManager.getIntance().getUser(token);
    if (user != null) {
        user.setPushTerminal(terminal);
        java.util.Queue<com.skyworld.push.event.SHPEvent> queue = user.getPendingEvents();
        com.skyworld.push.event.SHPEvent ev = null;
        while ((ev = queue.poll()) != null) {
            terminal.postEvent(ev);
        } 
    }
}