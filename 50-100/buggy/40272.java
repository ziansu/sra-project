public Model.Admin dohvatiAdminaPoKorisnickomImenu(java.lang.String korisnickoIme) {
    org.hibernate.Query query;
    otvoriSession();
    query = hibernateSession.createQuery((("from Admin as K where K.korisnickoIme = '" + korisnickoIme) + "'"));
    Model.Admin postojeciAdmin = ((Model.Admin) (query.list().get(0)));
    zatvoriSession();
    return postojeciAdmin;
}