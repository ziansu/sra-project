private synchronized com.jaitlapps.bestadvice.domain.list.GroupListEntry loadGroups() {
    java.lang.String jsonGroups = loadJsonDataFromFile("group");
    return gson.fromJson(jsonGroups, com.jaitlapps.bestadvice.domain.list.GroupListEntry.class);
}