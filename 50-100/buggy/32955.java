@org.junit.Test
public void infiniteLoopsAreBadMmmK() {
    java.lang.System.setProperty("empire.configuration.file", "test.empire.config.properties");
    com.clarkparsia.empire.Empire.init(new com.clarkparsia.empire.sesametwo.OpenRdfEmpireModule());
    javax.persistence.EntityManager aMgr = javax.persistence.Persistence.createEntityManagerFactory("test-data-source").createEntityManager();
    com.clarkparsia.empire.test.TestMisc.One one = new com.clarkparsia.empire.test.TestMisc.One();
    com.clarkparsia.empire.test.TestMisc.Two two = new com.clarkparsia.empire.test.TestMisc.Two();
    one.two = two;
    two.one = one;
    aMgr.persist(one);
}