@org.junit.BeforeClass
public static void prepare() {
    boolean deleted = new java.io.File("database.db").delete();
    com.karol.repository.MockDatabase.entityManager = new com.karol.repository.access.EntityManager("test_lite_unit");
}