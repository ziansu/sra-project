public static java.util.ArrayList<net.somethingdreadful.MAL.api.MALModels.BaseModels.History> convertBaseHistoryList(java.util.ArrayList<net.somethingdreadful.MAL.api.MALModels.History> histories, java.lang.String username) {
    java.util.ArrayList<net.somethingdreadful.MAL.api.MALModels.BaseModels.History> historyArrayList = new java.util.ArrayList<>();
    for (net.somethingdreadful.MAL.api.MALModels.History history : histories) {
        historyArrayList.add(history.createBaseModel(username));
    }
    return historyArrayList;
}