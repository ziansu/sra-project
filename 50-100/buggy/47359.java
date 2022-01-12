private void resetLives() {
    if (!(nl.joshuaslik.tudelft.SEM.model.container.GameInfo.getInstance().getPlayerMode().equals(PlayerMode.SURVIVAL))) {
        javafx.scene.image.Image image = new javafx.scene.image.Image(java.lang.Class.class.getResourceAsStream((("/data/gui/img/heart" + (nl.joshuaslik.tudelft.SEM.model.container.GameInfo.getInstance().getLives())) + ".png")));
        lives.setImage(image);
    }else {
        javafx.scene.image.Image image = new javafx.scene.image.Image(java.lang.Class.class.getResourceAsStream("/data/gui/img/heart0.png"));
        lives.setImage(image);
    }
}