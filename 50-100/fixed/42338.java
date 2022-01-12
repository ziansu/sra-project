public void schedule_miner(WorldModel world, int ticks, java.util.HashMap<java.lang.String, java.util.List<PImage>> i_store) {
    this.schedule_action(world, this.create_miner_action(world, i_store), (ticks + (this.get_rate())));
    this.schedule_animation(world, 0);
}