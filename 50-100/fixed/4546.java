@java.lang.Override
public void run() {
    try {
        executePredictionCalculation();
        org.oracul.service.task.PredictionTask3D.LOGGER.debug((("Execute calculation 3D task #" + (getId())) + ": test sleep for 10 sec"));
        org.oracul.service.dto.Prediction3D pred = facade.getPrediction3dRepository().findById(getId());
        pred = facade.getBuilder3D().buildPrediction(pred);
        facade.getPrediction3dRepository().savePrediction(pred);
        facade.removeStatus(getId());
    } finally {
        facade.releaseCores(getCores());
    }
}