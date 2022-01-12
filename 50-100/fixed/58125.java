public double eaten(javafx.scene.Group group, java.util.List<xyz.luan.life.model.Entity> entities) {
    entities.remove(this);
    group.getChildren().remove(body);
    return ((energy) * (Util.BASE_ENERGY_RELEASED)) + ((area) * (Util.BASE_STRUCTURE_ENERGY));
}