private void removeDeadAgents() {
    for (int i = 0; i < (agentList.size()); i++) {
        RabbitsGrassSimulationAgent agnt = agentList.get(i);
        if ((agnt.getEnergy()) < 1) {
            rbSpace.removeAgentAt(agnt.getX(), agnt.getY());
            agentList.remove(i);
        }
    }
}