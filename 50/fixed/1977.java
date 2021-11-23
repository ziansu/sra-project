@org.junit.Test
public void roundTripTest() throws java.io.IOException {
    roundTripTest(eu.itesla_project.ucte.network.UcteFileReadWriteTest.create(), eu.itesla_project.ucte.network.UcteFileReadWriteTest::write, eu.itesla_project.ucte.network.UcteFileReadWriteTest::read, eu.itesla_project.ucte.network.UcteFileReadWriteTest.REFERENCE);
}