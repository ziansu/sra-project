@java.lang.Override
public void likeProfileImpl(fr.kayrnt.tindplayer.model.Profile profile, boolean shouldLike) {
    java.lang.String likeOrPassAPI = (shouldLike) ? "/like/" : "/pass/";
    fr.kayrnt.tindplayer.utils.GsonRequest<org.json.JSONObject> request = new fr.kayrnt.tindplayer.utils.GsonRequest<org.json.JSONObject>(Request.Method.GET, (((API_URL) + likeOrPassAPI) + (profile.getId())), org.json.JSONObject.class, getAuthHeaders(true), null, new fr.kayrnt.tindplayer.api.like.LikeAPIListener(this, shouldLike, profile), new fr.kayrnt.tindplayer.api.like.LikeAPIErrorListener(this, profile, shouldLike));
    fr.kayrnt.tindplayer.MyApplication.getInstance().withSessionManager(request);
}