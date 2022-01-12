public static org.liveSense.core.session.SessionFactory getInstance(long defaultSessionTimeout, long sessionTimeoutCheckInterval, long sessionCloseTimeout) {
    if ((org.liveSense.core.session.SessionFactoryImpl.factory) == null) {
        org.liveSense.core.session.SessionFactoryImpl.log.info("Creating liveSense Session Factory. \n   Default session timeout: {}\n   Session timeout check interval: {}\n   Session close timeout: {}\n    Factory close timeout: {} ", new java.lang.Object[]{ defaultSessionTimeout , sessionTimeoutCheckInterval , sessionCloseTimeout });
        org.liveSense.core.session.SessionFactoryImpl.factory = new org.liveSense.core.session.SessionFactoryImpl();
        org.liveSense.core.session.SessionFactoryImpl.factory.sessionTimeoutCheckInterval = sessionTimeoutCheckInterval;
        org.liveSense.core.session.SessionFactoryImpl.factory.closeTaskTimeout = sessionCloseTimeout;
        org.liveSense.core.session.SessionFactoryImpl.factory.defaultSessionTimeout = defaultSessionTimeout;
        org.liveSense.core.session.SessionFactoryImpl.factory.createExecuters();
    }
    return org.liveSense.core.session.SessionFactoryImpl.factory;
}