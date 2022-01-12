@org.junit.Test
public void infiniteLoopsAreBadMmmK() {
    javax.persistence.EntityManager aMgr = javax.persistence.Persistence.createEntityManagerFactory("test-data-source").createEntityManager();
    com.clarkparsia.empire.test.TestMisc.One one = new com.clarkparsia.empire.test.TestMisc.One();
    com.clarkparsia.empire.test.TestMisc.Two two = new com.clarkparsia.empire.test.TestMisc.Two();
    one.two = two;
    two.one = one;
    aMgr.persist(one);
}