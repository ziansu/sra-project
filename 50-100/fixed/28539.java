protected void hardBoundary(simulator.agent.LocatedAgent anAgent, simulator.geometry.boundaryConditions.ContinuousVector target) {
    _myShape.orthoProj(target, target);
    simulator.geometry.boundaryConditions.ContinuousVector vectorIn = new simulator.geometry.boundaryConditions.ContinuousVector(_myShape.getNormalInside());
    vectorIn.normalizeVector();
    vectorIn.times(anAgent.getRadius(true));
    target.add(vectorIn);
    anAgent.getMovement().sendDiff(target, anAgent.getLocation());
}