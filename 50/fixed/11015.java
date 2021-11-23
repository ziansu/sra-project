public static final bolts.Task<com.dounets.vchat.net.api.ApiResponse> doRequestDownloadVideo(android.content.Context context, java.lang.String url) {
    com.dounets.vchat.net.api.ApiRequest request = new com.dounets.vchat.net.api.ApiRequest(ApiRequest.Method.GET, null, null);
    return com.dounets.vchat.net.api.ApiClient.callInBackgroundDownloadVideo(request, context, url);
}