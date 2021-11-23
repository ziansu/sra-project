@org.junit.Test
public void testGetTargetTimestamp() {
    model.PredictionFactory f = new model.PredictionFactory(null, model.PredictionTime.MORNING, null);
    java.lang.System.out.println(("timestamp:" + (f.getTargetTimestamp(PredictionTime.MORNING))));
}