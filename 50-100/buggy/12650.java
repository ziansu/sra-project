@java.lang.Override
public void updateAI(float tpf) {
    this.timePerFrame = tpf;
    calculateNewVelocity(tpf);
    velocity.multLocal(this.brakingFactor);
    switch (agent.getApplyType()) {
        case Spatial :
            agent.setWorldTranslation(agent.getPredictedPosition());
            rotateAgent(tpf);
            break;
        case BetterCharacterControl :
        case RigidBody :
            throw new java.lang.RuntimeException((("The ApplyType " + (agent.getApplyType())) + " isn't supported yet, sorry."));
        case DontApply :
            break;
    }
}