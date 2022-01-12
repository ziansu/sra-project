public double eaten(javafx.scene.Group group, java.util.List<xyz.luan.life.model.Entity> entities) {
    group.getChildren().remove(body);
    entities.remove(this);
    return ((energy) * (Util.BASE_ENERGY_RELEASED)) + ((area) * (Util.BASE_STRUCTURE_ENERGY));
}