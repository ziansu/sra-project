private void handleCollision(javafx.animation.AnimationTimer timer) {
    for (int i = 0; i < (enemies.size()); i++) {
        javafx.scene.shape.Circle enemy = ((javafx.scene.shape.Circle) (enemies.get(i)));
        if ((collided(enemy)) && (pane.getChildren().contains(enemy))) {
            timer.stop();
            pane.getChildren().removeAll(line, enemy);
        }
    }
}