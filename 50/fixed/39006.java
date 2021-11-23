public static synchronized ua.lutsenko.banking.dao.DaoFactory getInstance() {
    if ((ua.lutsenko.banking.dao.DaoFactory.INSTANCE) == null) {
        try {
            ua.lutsenko.banking.dao.DaoFactory.INSTANCE = new ua.lutsenko.banking.dao.DaoFactory();
        } catch (javax.naming.NamingException ex) {
            ua.lutsenko.banking.dao.DaoFactory.LOG.error("Bad INSTANCE ", ex);
        }
    }
    return ua.lutsenko.banking.dao.DaoFactory.INSTANCE;
}