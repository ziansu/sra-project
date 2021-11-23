public static void add_entity(WorldModel world, java.lang.String[] properties, java.util.HashMap<java.lang.String, java.util.List<PImage>> i_store, boolean run) {
    Location new_entity = Save_load.create_from_properties(properties, i_store);
    if (new_entity != null) {
        world.add_entity(((Job) (new_entity)));
        if (run) {
            Save_load.schedule_entity(world, ((Job) (new_entity)), i_store);
        }
    }
}