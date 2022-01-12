public Miner try_transform_miner(WorldModel world, java.util.function.Function<WorldModel, Miner> transform) {
    Miner new_entity = transform(world);
    if ((this) != new_entity) {
        for (java.util.function.LongConsumer action : this.get_pending_actions()) {
            world.unschedule_action(action);
        }
        this.clear_pending_actions();
        world.remove_entity_at(this.get_position());
        world.add_entity(new_entity);
        new_entity.schedule_animation(world, 0);
    }
    return new_entity;
}