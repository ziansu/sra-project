@java.lang.Override
public void handleEvent(com.extjs.gxt.ui.client.event.BaseEvent be) {
    if ((handler) != null) {
        exercise.setWeights(tfWeights.getValue());
        handler.saveData(exercise, false);
    }
}