public static java.lang.String addUser(com.barrieault.budgettabs.User u) {
    if ((com.barrieault.budgettabs.DAO.factory) == null)
        com.barrieault.budgettabs.DAO.setupFactory();
    
    org.jasypt.util.password.BasicPasswordEncryptor passwordEncryptor = new org.jasypt.util.password.BasicPasswordEncryptor();
    u.setPassword(passwordEncryptor.encryptPassword(u.getPassword()));
    org.hibernate.Session hibernateSession = com.barrieault.budgettabs.DAO.factory.openSession();
    hibernateSession.getTransaction().begin();
    hibernateSession.save(u);
    hibernateSession.getTransaction().commit();
    hibernateSession.close();
    return null;
}