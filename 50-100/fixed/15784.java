public static com.jcraft.jsch.Session getSession(java.lang.String name) {
    java.lang.String addr = nju.ics.lixiaofan.resource.Resource.brickAddr.get(name);
    com.jcraft.jsch.Session session = null;
    if (addr != null) {
        try {
            session = nju.ics.lixiaofan.resource.Resource.JSCH.getSession("robot", addr);
            session.setPassword("maker");
        } catch (com.jcraft.jsch.JSchException e) {
            e.printStackTrace();
        }
    }
    return session;
}