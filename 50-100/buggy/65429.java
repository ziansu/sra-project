static void behave(com.wizzer.mle.parts.actors.MleModelActor actor) {
    if ((com.wizzer.mle.parts.actors.MleModelActor.m_delta) == null)
        com.wizzer.mle.parts.actors.MleModelActor.m_delta = new com.wizzer.mle.math.MlRotation(new com.wizzer.mle.math.MlVector3(com.wizzer.mle.math.MlScalar.ML_SCALAR_ZERO, com.wizzer.mle.math.MlScalar.ML_SCALAR_ONE, com.wizzer.mle.math.MlScalar.ML_SCALAR_ZERO), ((float) (0.035)));
    
    com.wizzer.mle.math.MlRotation rotation = actor.orientation.getProperty();
    rotation.mul(com.wizzer.mle.parts.actors.MleModelActor.m_delta);
    try {
        actor.orientation.push(actor);
    } catch (com.wizzer.mle.runtime.core.MleRuntimeException ex) {
    }
}