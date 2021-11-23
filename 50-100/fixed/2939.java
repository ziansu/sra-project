private static boolean isFollowActionSuccessful(org.json.JSONObject json, boolean isAskingToFollow) {
    if (json == null) {
        return false;
    }
    boolean isSubscribed;
    if (json.has("subscribed")) {
        isSubscribed = json.optBoolean("subscribed", false);
    }else {
        isSubscribed = (json.has("is_following")) && (json.optBoolean("is_following", false));
    }
    return isSubscribed == isAskingToFollow;
}