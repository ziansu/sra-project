public static void configure(stroom.Config config, stroom.startup.Environment environment) {
    org.eclipse.jetty.server.session.HashSessionManager manager = new org.eclipse.jetty.server.session.HashSessionManager();
    org.eclipse.jetty.server.session.SessionHandler sessions = new org.eclipse.jetty.server.session.SessionHandler(manager);
    environment.servlets().setSessionHandler(sessions);
    environment.jersey().setUrlPattern("/api/*");
    java.lang.System.setProperty("spring.profiles.active", java.lang.String.format("%s,%s", StroomSpringProfiles.PROD, SecurityConfiguration.PROD_SECURITY));
    stroom.util.thread.ThreadScopeContextHolder.createContext();
}