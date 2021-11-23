public static java.util.List<introsde.rest.ehealth.model.Person> getAll() {
    java.lang.System.out.println("--> Initializing Entity manager...");
    introsde.rest.ehealth.model.EntityManager em = LifeCoachDao.instance.createEntityManager();
    java.lang.System.out.println("--> Querying the database for all the people...");
    java.util.List<introsde.rest.ehealth.model.Person> list = em.createNamedQuery("Person.findAll", introsde.rest.ehealth.model.Person.class).getResultList();
    java.lang.System.out.println("--> Closing connections of entity manager...");
    LifeCoachDao.instance.closeConnections(em);
    return list;
}