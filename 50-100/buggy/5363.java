public java.lang.String getClickedBuildingMapName(java.awt.Point inputPnt) {
    java.lang.String buildingMapName = null;
    gtg_model_subsystem.Node mappingResult = searchingAPointInNodeList(inputPnt);
    if (mappingResult != null) {
        java.lang.String buildingName = mappingResult.getBuilding();
        java.lang.System.out.println(mappingResult.getDescription());
        if (!(buildingName.equals("CampusMap"))) {
            getDesiredMapFromMapList(buildingName);
            return buildingName;
        }
    }
    return buildingMapName;
}