public static java.util.List<introsde.rest.ehealth.model.Person> getAll() {
    introsde.rest.ehealth.model.EntityManager em = LifeCoachDao.instance.createEntityManager();
    java.util.List<introsde.rest.ehealth.model.Person> list = em.createNamedQuery("Person.findAll", introsde.rest.ehealth.model.Person.class).getResultList();
    LifeCoachDao.instance.closeConnections(em);
    return list;
}