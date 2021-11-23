@java.lang.Override
public void onMapSaved(com.makalaster.adventurefriends.model.map.Map map) {
    com.makalaster.adventurefriends.model.campaign.ModuleHolder module = com.makalaster.adventurefriends.model.campaign.ModuleHolder.getInstance();
    module.setMap(map);
    com.google.firebase.database.DatabaseReference mapReference = com.google.firebase.database.FirebaseDatabase.getInstance().getReference((((("campaigns/" + (mCampaignId)) + "/modules/") + (module.getModule().getId())) + "/map"));
    mapReference.setValue(map);
}