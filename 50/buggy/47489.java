private java.util.ArrayList<Experiment> getExperiments(java.lang.String cameraId) {
    experiments = new DBQuery().getExperiments(cameraId);
    return experiments;
}