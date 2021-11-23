public frc3824.rohawkticsscouting2017.Firebase.DataModels.TeamLogistics getTeamLogistics(int team_number) {
    com.google.firebase.database.DataSnapshot d = mMaps.get(Constants.Database_Lists.indices.LOGISTICS).get(java.lang.String.valueOf(team_number));
    if (d == null) {
        return null;
    }
    frc3824.rohawkticsscouting2017.Firebase.DataModels.TeamLogistics tl = d.getValue(frc3824.rohawkticsscouting2017.Firebase.DataModels.TeamLogistics.class);
    java.util.Collections.sort(tl.match_numbers);
    return tl;
}