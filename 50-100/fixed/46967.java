private void addCommunityToList(org.json.JSONObject message) {
    de.szut.dqi12.cheftrainer.connectorlib.dataexchange.Community community = new de.szut.dqi12.cheftrainer.connectorlib.dataexchange.Community(message.getJSONObject("community"));
    community.findeUsersManager(mesController.getSession().getUser().getUserName());
    de.szut.dqi12.cheftrainer.client.Controller.getInstance().getSession().addCommunity(community);
}