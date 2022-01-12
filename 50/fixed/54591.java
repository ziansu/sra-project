@java.lang.Override
public long step() {
    currentExperiment.getAgent().getSimulation().step(this.getScope());
    return (currentStep)++;
}