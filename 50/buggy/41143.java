private ExperimentValfunction.ensemble_system.voices.Opinion selectRandomOpinion() {
    int opinion = randomGenerator.nextInt(opinions.size());
    java.lang.System.out.println(("Random voice: " + opinion));
    return opinions.get(opinion);
}