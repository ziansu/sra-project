private io.faucette.scene_graph.Scene removeEntityNow(io.faucette.scene_graph.Entity entity) {
    if (entityHash.containsKey(entity.getId())) {
        entity.scene = null;
        entities.remove(entity);
        entityHash.remove(entity.getId());
        if (entity.hasName()) {
            entityNameHash.remove(entity.getName());
        }
        for (io.faucette.scene_graph.Component component : entity.components) {
            removeComponent(component);
        }
        for (io.faucette.scene_graph.Entity child : entity.children) {
            removeEntityNow(child);
        }
    }
    return this;
}