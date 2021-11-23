@java.lang.Override
public void resetLearning() {
    this.trainingWeightSeenByModel = 0.0;
    if (isRandomizable()) {
        if ((this.randomSeedOption) == null) {
            this.randomSeedOption = new moa.options.IntOption("randomSeed", 'r', "Seed for random behaviour of the classifier.", this.randomSeed);
        }
        this.randomSeedOption.setValue(this.randomSeed);
        this.classifierRandom = new java.util.Random(this.randomSeed);
    }
    resetLearningImpl();
}