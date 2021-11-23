private static boolean isFollowActionSuccessful(org.json.JSONObject json, boolean isAskingToFollow) {
    if (json == null) {
        return false;
    }
    final boolean isSubscribed;
    if (json.has("subscribed")) {
        isSubscribed = json.optBoolean("subscribed", false);
    }else
        if (json.has("is_following")) {
            isSubscribed = json.optBoolean("is_following", false);
        }else {
            isSubscribed = false;
        }
    
    return isSubscribed == isAskingToFollow;
}