protected void deleteAllWorkspaces() {
    java.util.List<java.lang.String> workspaces = it.geosolutions.geoserver.rest.GeoserverRESTTest.reader.getWorkspaceNames();
    for (java.lang.String workspace : workspaces) {
        it.geosolutions.geoserver.rest.GeoserverRESTTest.LOGGER.warn(("Deleting Workspace " + workspace));
        boolean removed = it.geosolutions.geoserver.rest.GeoserverRESTTest.publisher.removeWorkspace(workspace, false);
        assertTrue(("Workspace not removed " + workspace), removed);
    }
}