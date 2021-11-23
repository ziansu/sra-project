private Entities.Memberstatus getMemberStatusByName(java.lang.String name) {
    return ((Entities.Memberstatus) (em.createNamedQuery("Memberstatus.findByName").setParameter("name", name).getSingleResult()));
}