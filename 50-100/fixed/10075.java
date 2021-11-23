public static bolts.Task<com.dounets.vchat.net.api.ApiResponse> callInBackgroundDownloadVideo(final com.dounets.vchat.net.api.ApiRequest request, final android.content.Context context, final java.lang.String url) {
    return bolts.Task.callInBackground(new java.util.concurrent.Callable<com.dounets.vchat.net.api.ApiResponse>() {
        @java.lang.Override
        public com.dounets.vchat.net.api.ApiResponse call() throws java.lang.Exception {
            return com.dounets.vchat.net.api.ApiClient.callDownloadVideo(request, context, url);
        }
    });
}