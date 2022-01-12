private <TContext> void incrementExperiment(dinglydell.techresearch.experiment.Experiment<TContext> exp, TContext context) {
    if (!(experiments.containsKey(exp))) {
        experiments.put(exp, exp.getBlankData());
    }
    experiments.get(exp).useExperiment();
}