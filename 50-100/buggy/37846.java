public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Hello World!");
    entity.Midia midia = new entity.Midia();
    midia.setNome("Amo a momo");
    dao.MidiaHibernateDAO miDao = new dao.MidiaHibernateDAO();
    miDao.persist(midia);
    midia = miDao.listAll(entity.Midia.class, false).get(0);
    java.lang.System.out.println("que nojo");
    java.lang.System.exit(0);
}