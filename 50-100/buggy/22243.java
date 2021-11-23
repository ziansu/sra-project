@java.lang.Override
public void OnResponse(org.json.JSONObject response) {
    com.google.gson.Gson gsonInstance = new com.google.gson.GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    wipraktikum.informationwallandroidapp.BusinessObject.FeedReader.Feed serverFeed = gsonInstance.fromJson(new com.google.gson.JsonParser().parse(response.toString()), wipraktikum.informationwallandroidapp.BusinessObject.FeedReader.Feed.class);
    serverFeed = wipraktikum.informationwallandroidapp.ServerCommunication.TransientManager.keepTransientFeedData(serverFeed);
    serverFeed.setSyncStatus(true);
    wipraktikum.informationwallandroidapp.Database.DAO.FeedReader.FeedReaderDAO feedReaderDAO = wipraktikum.informationwallandroidapp.Database.DAO.DAOHelper.getFeedReaderDAO();
    feedReaderDAO.deleteByID(currentUnsyncedFeed.getFeedReaderID());
    feedReaderDAO.createOrUpdate(serverFeed);
    syncFeeds();
}