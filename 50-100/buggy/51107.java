public void updateMaps() {
    com.badlogic.gdx.files.FileHandle[] available_maps = com.toyknight.aeii.utils.MapFactory.getAvailableMaps();
    com.badlogic.gdx.utils.Array<java.lang.Object> maps = new com.badlogic.gdx.utils.Array<java.lang.Object>();
    for (com.badlogic.gdx.files.FileHandle map_file : available_maps) {
        com.toyknight.aeii.utils.MapFactory.MapSnapshot snapshot = com.toyknight.aeii.utils.MapFactory.createMapSnapshot(map_file);
        maps.add(snapshot);
    }
    object_list.setItems(maps);
    object_list.setSelectedIndex(0);
}