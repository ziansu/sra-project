private static org.json.JSONObject getTweetByID(java.lang.String status_id_str, twitter4j.Twitter twitter) {
    try {
        twitter4j.Status status = twitter.showStatus(java.lang.Long.parseLong(status_id_str));
        if (status == null) {
            return null;
        }else {
            java.lang.String rawJSON = twitter4j.TwitterObjectFactory.getRawJSON(status);
            org.json.JSONObject json = new org.json.JSONObject(rawJSON);
            return json;
        }
    } catch (twitter4j.TwitterException e) {
        sociam.pybossa.TaskCollector.logger.error("Error ", e);
        return null;
    }
}