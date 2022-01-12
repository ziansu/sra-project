public static void persistenceCurrentSession(com.torch.interfaces.common.security.Session session) {
    com.torch.interfaces.common.security.Session.threadSession.set(session);
}