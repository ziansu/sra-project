private void getTeamAssignment(java.lang.String listName, com.moandjiezana.toml.Toml toml) {
    java.util.List<java.lang.Long> list = toml.getList(listName);
    if ((list == null) || ((list.size()) == 0)) {
        return ;
    }
    teamAssignment = new int[list.size()];
    for (int i = 0; i < (teamAssignment.length); i++) {
        teamAssignment[i] = list.get(i).intValue();
    }
}