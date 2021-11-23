public <T> void addResearchPoints(dinglydell.techresearch.experiment.Experiment<T> exp, double multiplier, T context) {
    incrementExperiment(exp);
    for (java.util.Map.Entry<dinglydell.techresearch.researchtype.ResearchType, java.lang.Double> value : exp.getValues(this, multiplier, context).entrySet()) {
        addPoints(exp, value);
    }
    sendPacket();
}