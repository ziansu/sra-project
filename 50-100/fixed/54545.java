public void handlerInit(java.lang.String map_name, int start_x, int start_y, float health_max, float health_current, float health_regen) {
    player = new com.jacl.capstone.world.entities.player.Player(world, start_x, start_y, world.data_handler.player_root, health_max, health_current, health_regen);
    all_entities = new java.util.ArrayList<com.jacl.capstone.world.entities.Entity>();
    all_entities.add(player);
}