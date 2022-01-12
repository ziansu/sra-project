private void setUpFeedbacksFromCache() {
    if (com.wewow.utils.FileCacheUtil.isCacheDataExist(CommonUtilities.CACHE_FILE_FEEDBACKS, this)) {
        java.lang.String fileContent = com.wewow.utils.FileCacheUtil.getCache(this, CommonUtilities.CACHE_FILE_FEEDBACKS);
        java.util.List<com.wewow.dto.Feedback> feedbacks = new java.util.ArrayList<com.wewow.dto.Feedback>();
        try {
            feedbacks = parseFeedbackFromString(fileContent);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}