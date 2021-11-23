@java.lang.Override
public java.lang.String[] getMissionSuites(java.lang.String missionName, java.lang.String programName) {
    return target.path("ocssw").path("missionSuites").path(missionName).path(programName).request(MediaType.APPLICATION_JSON_TYPE).get(java.lang.String[].class);
}