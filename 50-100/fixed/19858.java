public void init(java.lang.String map_name, int start_x, int start_y, float health_max, float health_current, float health_regen) {
    map_handler.handlerInit(map_name);
    entity_handler.handlerInit(map_name, start_x, start_y, health_max, health_current, health_regen);
    camera_handler.handlerInit();
    collision_handler.handlerInit();
    event_handler.handlerInit();
    data_handler.handlerInit();
}