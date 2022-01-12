public Model.Grupa dohvatiGrupuPoIDu(int idGrupa) {
    org.hibernate.Query query;
    otvoriSession();
    query = hibernateSession.createQuery((("from Grupa as K where K.IDGrupa = '" + idGrupa) + "'"));
    Model.Grupa odabranaGrupa = ((Model.Grupa) (query.list().get(0)));
    zatvoriSession();
    return odabranaGrupa;
}