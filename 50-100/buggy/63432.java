public frc3824.rohawkticsscouting2017.Firebase.DataModels.TeamLogistics getTeamLogistics(int team_number) {
    com.google.firebase.database.DataSnapshot d = mMaps.get(Constants.Database_Lists.indices.LOGISTICS).get(java.lang.String.valueOf(team_number));
    if (d == null) {
        return null;
    }
    frc3824.rohawkticsscouting2017.Firebase.DataModels.TeamLogistics tl = d.getValue(frc3824.rohawkticsscouting2017.Firebase.DataModels.TeamLogistics.class);
    tl.match_numbers.sort(new java.util.Comparator<java.lang.Integer>() {
        @java.lang.Override
        public int compare(java.lang.Integer o1, java.lang.Integer o2) {
            return java.lang.Integer.compare(o1, o2);
        }
    });
    return tl;
}