@org.junit.BeforeClass
public static void prepare() throws java.io.IOException {
    com.karol.repository.MockDatabase.entityManager = new com.karol.repository.access.EntityManager("test_lite_unit");
}