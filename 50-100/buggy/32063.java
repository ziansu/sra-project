@java.lang.Override
protected java.util.List<teamcool.tradego.Models.Friend> doInBackground(java.lang.Void... voids) {
    teamcool.tradego.Clients.ParseClient parseClient = new teamcool.tradego.Clients.ParseClient();
    if ((getArguments()) == null) {
        friends = parseClient.queryFriendsOnName(null);
    }else {
        friends = parseClient.queryFriendsOnName(getArguments().getString("query"));
    }
    return friends;
}