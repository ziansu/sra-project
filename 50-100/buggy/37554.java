public void invoke() throws java.lang.Throwable {
    java.util.List<models.Admin> lis = Global.dao.findAllByClassName(models.Admin.class.getName());
    if ((lis.size()) < 3) {
        models.Admin a = new models.Admin("anelroute", "AnelRest15kk");
        models.Usuario u = new models.Usuario("Teste", "111.111.111-11", 10);
        Global.dao.persist(a);
        Global.dao.persist(u);
        Global.dao.flush();
        play.Logger.info("Inserindo dados no BD.");
    }
}