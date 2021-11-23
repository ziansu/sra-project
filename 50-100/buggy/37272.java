@java.lang.Override
public void init(de.cpgaertner.edu.inf.api.level.Level from) {
    de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.DoorLocation officeHallwayConnector = new de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.DoorLocation();
    de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.DoorLocation hallwayServerRoomConnector = new de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.DoorLocation();
    de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.DoorLocation hallwayOutsideConnector = new de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.DoorLocation();
    de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.StairsLocation stairs = new de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.StairsLocation();
    generateOffice(officeHallwayConnector);
    generateHallway(officeHallwayConnector, hallwayServerRoomConnector, hallwayOutsideConnector, stairs);
}