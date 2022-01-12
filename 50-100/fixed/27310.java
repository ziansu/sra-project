private void movePursuer(com.badlogic.ashley.core.Entity entity, float deltaTime) {
    com.dke.pursuitevasion.Entities.Components.agents.PursuerComponent pursuerComponent = Mappers.pursuerMapper.get(entity);
    com.dke.pursuitevasion.Entities.Components.StateComponent stateComponent = Mappers.stateMapper.get(entity);
    if (pursuerComponent.alerted) {
        followPath(pursuerComponent, stateComponent);
        trackTarget(pursuerComponent, stateComponent);
    }else {
        moveVision(pursuerComponent, stateComponent, deltaTime);
    }
    moveVision(pursuerComponent, stateComponent, deltaTime);
    limitAngle(pursuerComponent);
}