public java.util.List<locker.Accounts> List_Accounts(locker.User usuario) {
    try {
        iniciaOperacion();
        int usuarioAux = usuario.getIdUser();
        org.hibernate.Query query2 = sesion.createQuery(("SELECT a FROM Accounts a WHERE owner=" + usuarioAux));
        java.util.List<locker.Accounts> accounts = query2.list();
        java.lang.System.out.println(accounts.get(0).getNick());
        return accounts;
    } catch (org.hibernate.HibernateException he) {
        manejaExcepcion(he);
        throw he;
    } finally {
        finalizaOperacion();
    }
}