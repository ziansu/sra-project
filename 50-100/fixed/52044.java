private void setMatchesInGroupOrder() {
    int[] newOrder = new int[numberOfMatches];
    for (int i = 0; i < (newOrder.length); i++) {
        newOrder[i] = i;
    }
    fillTeamsLabelsAndGoalsTFs(currentMatchday);
}