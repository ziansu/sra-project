public void showConnectionBlips(com.TeamHEC.LocomotionCommotion.Map.Connection connection) {
    if ((train.getActor()) == null) {
    }else {
        com.badlogic.gdx.scenes.scene2d.Stage stage = train.getActor().getStage();
        for (com.badlogic.gdx.scenes.scene2d.Actor a : connection.getRouteBlips()) {
            a.setVisible(true);
            stage.addActor(a);
        }
    }
}