void killDepletedAgents() {
    for (Agents.Agent agent : agents) {
        if ((agent.food) <= 0) {
            GameLogic.Position deathPlace = agent.position;
            agents.remove(agent);
            tiles[deathPlace.x][deathPlace.y].agents.remove(agent);
        }
    }
}