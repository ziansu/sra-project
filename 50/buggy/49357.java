@org.junit.Before
public void setup() {
    graknGraph = new ai.grakn.factory.OrientDBInternalFactory(ai.grakn.graph.internal.GraknOrientDBGraphTest.TEST_NAME, ai.grakn.graph.internal.GraknOrientDBGraphTest.TEST_URI, null).open(GraknTxType.WRITE);
}