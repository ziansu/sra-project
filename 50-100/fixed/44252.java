@java.lang.Override
public long storeFile(final java.lang.String filename) throws de.xwic.appkit.core.dao.DataAccessException {
    java.lang.Long res = ((java.lang.Long) (new de.xwic.appkit.core.dao.UseCase() {
        @java.lang.Override
        protected java.lang.Object execute(de.xwic.appkit.core.dao.DAOProviderAPI api) {
            org.hibernate.Session session = de.xwic.appkit.core.dao.impl.hbn.HibernateUtil.currentSession();
            long res = storeFile(filename, session);
            return res;
        }
    }.execute()));
    if (res != null) {
        return res;
    }else {
        throw new de.xwic.appkit.core.dao.DataAccessException(("Could not store file: " + filename));
    }
}