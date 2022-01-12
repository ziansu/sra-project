public be.willima.jrpgdatabase.model.JRPGMap createNewMap(java.lang.String mapTitle, java.awt.Dimension dim) {
    int mapID = this.maps.size();
    be.willima.jrpgdatabase.model.JRPGMap newMap = new be.willima.jrpgdatabase.model.JRPGMap(this, mapID, mapTitle, dim.width, dim.height);
    maps.add(newMap);
    return newMap;
}