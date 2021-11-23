public fr.inria.spirals.repairnator.process.step.AbstractStep setNextStep(fr.inria.spirals.repairnator.process.step.AbstractStep nextStep) {
    this.nextStep = nextStep;
    nextStep.setDataSerializer(this.serializers);
    nextStep.setProperties(properties);
    return nextStep;
}