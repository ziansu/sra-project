@java.lang.Override
public void stateUpdated(int runId) {
    java.lang.System.err.println(("Updated " + runId));
    au.gov.ansto.bragg.quokka.experiment.model.Acquisition acquisition = stateManager.getAcquisition(runId);
    view.updateUI(acquisition);
}