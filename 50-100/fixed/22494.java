public laser.ddg.ProvenanceData getCurrentDDG() {
    laser.ddg.gui.DDGPanel curDDGPanel = laser.ddg.gui.DDGExplorer.getCurrentDDGPanel();
    if (curDDGPanel == null) {
        laser.ddg.gui.WorkflowPanel wfPanel = laser.ddg.gui.DDGExplorer.getCurrentWorkflowPanel();
        if (wfPanel == null) {
            return null;
        }
        return wfPanel.getProvData();
    }else {
        return curDDGPanel.getProvData();
    }
}