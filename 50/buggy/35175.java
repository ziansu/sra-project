@org.junit.Test
public void testInitialization() throws java.io.FileNotFoundException {
    java.lang.String filename = "src/main/resources/markovNet.txt";
    PSO.ICParticle p = new PSO.ICParticle(filename, ((PSO.FitnessFunction) (new PSO.GCFitnessFunction())));
    p.print();
}