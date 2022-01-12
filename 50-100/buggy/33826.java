@java.lang.Override
public void onStartup(ServletContext servletContext) throws ServletException {
    if ((env.getActiveProfiles().length) != 0) {
        log.info("Web application configuration, using profiles: {}", java.util.Arrays.toString(env.getActiveProfiles()));
    }
    java.util.EnumSet<DispatcherType> disps = java.util.EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.ASYNC);
}