protected void RemoveArc(edu.unibi.agbi.gnius.core.model.entity.graph.IGraphArc arc) {
    java.util.concurrent.atomic.AtomicBoolean isFinished = new java.util.concurrent.atomic.AtomicBoolean(false);
    javafx.application.Platform.runLater(() -> {
        try {
            dataGraphService.remove(arc);
        } catch (edu.unibi.agbi.gnius.core.service.exception.DataGraphServiceException ex) {
            java.lang.System.out.println(ex.toString());
        } finally {
            isFinished.set(true);
        }
    });
    waitForFxThread(isFinished);
}