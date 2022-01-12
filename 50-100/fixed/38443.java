public boolean addRoom(java.lang.String roomName) {
    if (allLocations.contains(roomName))
        return false;
    
    allLocations.add(roomName);
    house.addRoom(new il.ac.technion.cs.smarthouse.gui.controllers.mapping.Room(((il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.MARGIN) + (((roomNumbers) % (il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.ROOM_IN_ROW)) * (il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.WIDTH))), ((il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.MARGIN) + (((roomNumbers) / (il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.ROOM_IN_ROW)) * (il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.HEIGHT))), il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.WIDTH, il.ac.technion.cs.smarthouse.system.mapping_information.MappingInformation.HEIGHT, roomName));
    ++(roomNumbers);
    return true;
}