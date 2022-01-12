private java.lang.String getSpacesPath(java.lang.String componentId) {
    java.lang.StringBuilder spacesPath = new java.lang.StringBuilder();
    java.util.List<com.stratelia.webactiv.beans.admin.SpaceInst> spaces = getOrganisationController().getSpacePathToComponent(componentId);
    for (com.stratelia.webactiv.beans.admin.SpaceInst spaceInst : spaces) {
        spacesPath.append(spaceInst.getName());
        spacesPath.append(" > ");
    }
    return spacesPath.toString();
}