@java.lang.Override
public void onResponseCodeMatching(com.goebl.david.Response<org.json.JSONObject> response) {
    super.onResponseCodeMatching(response);
    adapter.setCampaignSpecification(response.getBody());
    activityIndicator.hide();
}