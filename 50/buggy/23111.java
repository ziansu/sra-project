private synchronized com.jaitlapps.bestadvice.domain.list.GroupListEntry loadGroups() {
    if ((com.jaitlapps.bestadvice.DataLoader.groupListEntry) == null) {
        java.lang.String jsonGroups = loadJsonDataFromFile("group");
        com.jaitlapps.bestadvice.DataLoader.groupListEntry = gson.fromJson(jsonGroups, com.jaitlapps.bestadvice.domain.list.GroupListEntry.class);
    }
    return com.jaitlapps.bestadvice.DataLoader.groupListEntry;
}