private static edu.rice.cs.hpc.data.experiment.merge.BaseMetric addMetric(edu.rice.cs.hpc.data.experiment.merge.BaseMetric source, int metric_index, edu.rice.cs.hpc.data.experiment.Experiment exp, int experiment_index, java.util.List<edu.rice.cs.hpc.data.experiment.merge.BaseMetric> metricList) {
    edu.rice.cs.hpc.data.experiment.merge.BaseMetric mm = source.duplicate();
    mm.setIndex(metric_index);
    if (mm instanceof edu.rice.cs.hpc.data.experiment.merge.DerivedMetric) {
        ((edu.rice.cs.hpc.data.experiment.merge.DerivedMetric) (mm)).setExperiment(exp);
    }
    edu.rice.cs.hpc.data.experiment.merge.ExperimentMerger.setMetricCombinedName(experiment_index, mm);
    metricList.add(mm);
    return mm;
}