public static void persistenceCurrentSession(com.torch.interfaces.common.security.Session session) {
    com.torch.interfaces.common.security.Session profile = com.torch.interfaces.common.security.Session.threadSession.get();
    if (profile == null) {
        com.torch.interfaces.common.security.Session.threadSession.set(session);
    }
}