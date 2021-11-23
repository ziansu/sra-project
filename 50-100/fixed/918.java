public void init() throws com.wizzer.mle.runtime.core.MleRuntimeException {
    if ((texture) != null)
        texture.push(this);
    
    if ((model) != null)
        model.push(this);
    
    update();
    com.wizzer.mle.runtime.scheduler.MleScheduler scheduler = com.wizzer.mle.runtime.MleTitle.getInstance().m_theScheduler;
    com.wizzer.mle.runtime.scheduler.MlePhase actorPhase = com.wizzer.mle.runtime.MleTitle.g_theActorPhase;
    if (actorPhase == null)
        throw new com.wizzer.mle.runtime.core.MleRuntimeException("MleModelActor: Actor phase does not exist.");
    
    m_behaveTask = new com.wizzer.mle.runtime.scheduler.MleTask(new com.wizzer.mle.parts.actors.MleModelActor.DoBehave(this));
    scheduler.addTask(actorPhase, m_behaveTask);
}