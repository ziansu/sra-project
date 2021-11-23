private void addPlatform(int level) {
    java.lang.String stage = ("assets/maps/jsonfile/stage" + 2) + ".json";
    if (stage != null) {
        bases.maps.Map map = bases.maps.Map.load(stage);
        map.generate();
    }
}