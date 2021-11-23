public static void getAndTrackDeeplink(java.lang.String uri, com.mparticle.kits.IterableHelper.IterableActionHandler onCallback) {
    if (uri != null) {
        java.util.regex.Matcher m = com.mparticle.kits.IterableApi.deeplinkPattern.matcher(uri);
        if (m.find()) {
            com.mparticle.kits.IterableDeeplinkApiRequest request = new com.mparticle.kits.IterableDeeplinkApiRequest(uri, onCallback);
            new com.mparticle.kits.IterableRequest().execute(request);
        }else {
            onCallback.execute(uri);
        }
    }else {
        onCallback.execute(null);
    }
}