private ExperimentValfunction.ensemble_system.voices.Opinion selectRandomOpinion() {
    int opinion = randomGenerator.nextInt(opinions.size());
    return opinions.get(opinion);
}