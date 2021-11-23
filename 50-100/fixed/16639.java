public void pulletCollision() {
    if (vshape.getBoundsInLocal().intersects(shape.getBoundsInLocal())) {
        pane.getChildren().removeAll(vshape, shape);
        fullscore = scoreCounter(100);
        stage.setTitle(("Shooter - punktisumma on:  " + (fullscore)));
        tulista = false;
    }
}