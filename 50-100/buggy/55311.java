public java.lang.String getToolName(org.continuousassurance.swamp.cli.SwampApiWrapper api, java.lang.String projectUUID) throws java.lang.Exception {
    java.lang.String returnName = "";
    for (java.lang.String nextUUID : toolUUID.split(",")) {
        returnName += ", " + (api.getTool(nextUUID, projectUUID).getName());
    }
    returnName = returnName.substring(2);
    return returnName;
}