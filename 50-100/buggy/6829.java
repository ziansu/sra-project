public Objects.MapTypes.MapInterface createMap(int mapSize, int numOfPlayers, int choice) {
    switch (choice) {
        case 1 :
            Objects.MapTypes.SafeMapCreator creator = new Objects.MapTypes.SafeMapCreator();
            return creator.create(mapSize, numOfPlayers);
        case 2 :
            Objects.MapTypes.HazardousMapCreator creator2 = new Objects.MapTypes.HazardousMapCreator();
            return creator2.create(mapSize, numOfPlayers);
    }
    return null;
}