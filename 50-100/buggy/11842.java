public edu.vt.ece5574.agents.Robot createRobot() {
    sim.util.Int2D pos = genStartPos();
    edu.vt.ece5574.agents.Robot robot = new edu.vt.ece5574.agents.Robot(state, id, java.lang.String.valueOf(agentsInBld.size()), pos.getX(), pos.getY());
    agents.setObjectLocation(robot, pos.getX(), pos.getY());
    agentsInBld.add(robot);
    state.addAgent(robot);
    return robot;
}