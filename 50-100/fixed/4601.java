@org.junit.Before
public void init() {
    sim = new edu.vt.ece5574.sim.Simulation(1);
    java.lang.String rID = "1";
    java.lang.String bID = "0";
    bld = new edu.vt.ece5574.agents.Building(bID);
    sim.addAgent(bld);
    rob = new edu.vt.ece5574.agents.Robot(rID, bID, 5, 100);
    assertTrue(sim.addAgent(rob));
}