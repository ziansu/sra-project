public java.lang.String getToolName(org.continuousassurance.swamp.cli.SwampApiWrapper api, java.lang.String projectUUID) throws java.lang.Exception {
    java.lang.StringBuffer returnName = new java.lang.StringBuffer();
    for (java.lang.String nextUUID : toolUUID.split(",")) {
        returnName.append((", " + (api.getTool(nextUUID, projectUUID).getName())));
    }
    returnName = returnName.delete(0, 2);
    return returnName.toString();
}