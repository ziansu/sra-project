public static java.util.ArrayList<model.Content> getDiscoverPageData(int pageNo) {
    int carousellNo = 4;
    int articleLimitPerPage = 12;
    int entryLimit = 12;
    int entrySkip = carousellNo + (articleLimitPerPage * (pageNo - 1));
    int entryContentTypeId = 351;
    controller.ApiController apiController = new controller.ApiController();
    java.util.ArrayList<model.Content> discoverList = apiController.getAllContentEntries(entryLimit, entrySkip, entryContentTypeId);
    return discoverList;
}