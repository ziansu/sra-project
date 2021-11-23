public Objects.MapTypes.MapInterface createMap(int mapSize, int numOfPlayers, int choice) {
    if (choice == 1) {
        Objects.MapTypes.SafeMapCreator creator = new Objects.MapTypes.SafeMapCreator();
        return creator.create(mapSize, numOfPlayers);
    }else {
        Objects.MapTypes.HazardousMapCreator creator2 = new Objects.MapTypes.HazardousMapCreator();
        return creator2.create(mapSize, numOfPlayers);
    }
}