public static com.jcraft.jsch.Session getSession(java.lang.String name) {
    com.jcraft.jsch.Session session = nju.ics.lixiaofan.resource.Resource.sessions.get(name);
    if (session == null) {
        java.lang.String addr = nju.ics.lixiaofan.resource.Resource.brickAddr.get(name);
        if (addr != null) {
            try {
                session = nju.ics.lixiaofan.resource.Resource.JSCH.getSession("robot", addr);
                session.setPassword("maker");
                nju.ics.lixiaofan.resource.Resource.sessions.put(name, session);
            } catch (com.jcraft.jsch.JSchException e) {
                e.printStackTrace();
            }
        }
    }
    return session;
}