@java.lang.Override
public void onInitFinished(org.json.JSONObject referringParams, io.branch.referral.BranchError error) {
    if (error == null) {
        if (referringParams.has(Const.Branch.ATTRIBUTE_EVENT_ID)) {
            com.google.gson.Gson gson = new com.google.gson.Gson();
            java.lang.String json = mc2.tvz.croatiago.utils.Tools.getSharedPreferences(this).getCustomString("object");
            mc2.tvz.croatiago.models.SimplePlaceModel model = gson.fromJson(json, mc2.tvz.croatiago.models.SimplePlaceModel.class);
            java.util.List<mc2.tvz.croatiago.models.SimplePlaceModel> simplePlaceModelList = new java.util.ArrayList<>();
            simplePlaceModelList.add(model);
            mc2.tvz.croatiago.activities.DetailActivity.startDetailsActivity(this, simplePlaceModelList, 0, true);
        }
    }
}