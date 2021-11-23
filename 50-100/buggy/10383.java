private void load() {
    if ((realMap) == null) {
        realMap = WPI.CampusMap.Recording.Serialization.Serializer.realLoad(mapName);
        if ((realMap) == null) {
            realMap = new WPI.CampusMap.Backend.Core.Map.RealMap(mapName);
            realMap.validatePoints();
        }else {
            realMap.validatePoints();
        }
    }
}