@org.junit.Before
public void setUp() throws java.lang.Exception {
    ai.grakn.factory.GraknOrientDBGraphFactoryTest.orientGraphFactory = new ai.grakn.factory.OrientDBInternalFactory(ai.grakn.factory.GraknOrientDBGraphFactoryTest.TEST_NAME, ai.grakn.factory.GraknOrientDBGraphFactoryTest.TEST_URI, null, null);
}