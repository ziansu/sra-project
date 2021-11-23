@java.lang.Override
public void stateUpdated(int runId) {
    au.gov.ansto.bragg.quokka.experiment.model.Acquisition acquisition = stateManager.getAcquisition(runId);
    view.updateUI(acquisition);
}