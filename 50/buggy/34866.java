@java.lang.Override
public int findBiggestWebsiteId(int id_website) {
    return java.lang.Integer.parseInt(("" + (em.createNamedQuery("Website.findBiggestId").setMaxResults(1).getResultList().get(0))));
}