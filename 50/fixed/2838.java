@org.junit.Before
public void setUp() throws java.lang.Exception {
    engine = new simulation.Engine(new simulation.schedulers.FIFOScheduler());
}