public java.util.List<package_Cookie.Bestellung> findAllBestellungen() {
    return em.createNamedQuery("Bestellung.findAll", package_Cookie.Bestellung.class).getResultList();
}