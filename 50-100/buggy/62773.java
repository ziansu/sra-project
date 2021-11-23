@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public java.lang.String getTeamNames() {
    java.util.List<com.macklive.objects.Team> teams = com.macklive.storage.DataManager.getInstance().getTeams();
    teams.sort(new java.util.Comparator<com.macklive.objects.Team>() {
        @java.lang.Override
        public int compare(com.macklive.objects.Team t1, com.macklive.objects.Team t2) {
            return t1.getName().compareTo(t2.getName());
        }
    });
    com.google.gson.Gson gs = com.macklive.objects.GsonUtility.getGson();
    return gs.toJson(teams);
}