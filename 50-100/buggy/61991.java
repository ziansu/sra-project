@java.lang.Override
public void onSnackBarAction(java.lang.Object o) {
    plant.getActions().remove(action);
    me.anon.lib.manager.PlantManager.getInstance().upsert(plantIndex, plant);
    if ((plant.getStage()) != null) {
        stage.setText(plant.getStage().getPrintString());
    }
}