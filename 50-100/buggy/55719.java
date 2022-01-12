private java.lang.String getSpacesPath(java.lang.String componentId) {
    java.lang.String spacesPath = "";
    java.util.List<com.stratelia.webactiv.beans.admin.SpaceInst> spaces = getOrganisationController().getSpacePathToComponent(componentId);
    for (com.stratelia.webactiv.beans.admin.SpaceInst spaceInst : spaces) {
        spacesPath += spaceInst.getName();
        spacesPath += " > ";
    }
    return spacesPath;
}