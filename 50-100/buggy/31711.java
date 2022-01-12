@java.lang.Override
public void run() {
    executePredictionCalculation();
    org.oracul.service.task.PredictionTask2D.LOGGER.debug(("Execute calculation 2D task#" + (getId())));
    org.oracul.service.dto.Prediction2D pred = facade.getPrediction2dRepository().findById(getId());
    pred = facade.getBuilder2D().buildPrediction(pred);
    facade.getPrediction2dRepository().savePrediction(pred);
    facade.removeStatus(getId());
    facade.releaseCores(getCores());
}