@org.junit.Test(timeout = 1000)
public void randomMovement() {
    java.lang.String rID = "1";
    edu.vt.ece5574.agents.User oUsr = new edu.vt.ece5574.agents.User(sim, rID, bID, true, 1, 1);
    sim.addAgent(oUsr);
    double initial_x = oUsr.getX();
    double initial_y = oUsr.getY();
    oUsr.createRandomMovement(sim);
    assertFalse((((oUsr.getX()) == initial_x) && ((oUsr.getY()) == initial_y)));
}