public static void setMe(com.dreamdigitizers.androidsoundcloudapi.models.Me pMe) {
    if (pMe != null) {
        com.dreamdigitizers.androidsoundcloudapi.models.Me oldMe = com.dreamdigitizers.mysound.Share.getMe();
        com.dreamdigitizers.mysound.Share.bundle.putSerializable(com.dreamdigitizers.mysound.Share.SHARE_KEY__MY_DATA, pMe);
        for (com.dreamdigitizers.mysound.Share.IOnDataChanged listener : com.dreamdigitizers.mysound.Share.listeners) {
            listener.onMeChanged(pMe, oldMe);
        }
    }
}