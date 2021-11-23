public org.terasology.logic.behavior.tree.Status update(float dt) {
    org.terasology.wildAnimals.component.FleeComponent fleeComponent = this.actor().getComponent(org.terasology.wildAnimals.component.FleeComponent.class);
    if (fleeComponent != null) {
        org.terasology.wildAnimals.CheckDamageNode.logger.info("Damage done");
        this.actor().getEntity().removeComponent(org.terasology.wildAnimals.component.FleeComponent.class);
        return org.terasology.logic.behavior.tree.Status.FAILURE;
    }else {
        return org.terasology.logic.behavior.tree.Status.RUNNING;
    }
}