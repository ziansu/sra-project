@java.lang.Override
public void onResponseCodeMatching(com.goebl.david.Response<org.json.JSONObject> response) {
    adapter.setCampaignSpecification(response.getBody());
    activityIndicator.hide();
}