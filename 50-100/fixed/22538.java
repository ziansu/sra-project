public java.lang.String getClickedBuildingMapName(java.awt.Point inputPnt) {
    java.lang.String buildingMapName = null;
    gtg_model_subsystem.Node mappingResult = searchingAPointInNodeList(inputPnt);
    if (mappingResult != null) {
        buildingMapName = mappingResult.getBuilding();
        if (!(buildingMapName.equals("CampusMap"))) {
            return buildingMapName;
        }
        buildingMapName = null;
    }
    return buildingMapName;
}