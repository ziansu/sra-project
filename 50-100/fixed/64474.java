private static com.cs410.android.util.CourseAppApi getAuthenticatedApiInterface(final java.lang.String authToken) {
    retrofit.RequestInterceptor requestInterceptor = new retrofit.RequestInterceptor() {
        @java.lang.Override
        public void intercept(com.cs410.android.util.RequestFacade request) {
            request.addHeader(WebUtils.KEY_HEADER_TOKEN, authToken);
        }
    };
    retrofit.RestAdapter restAdapter = new retrofit.RestAdapter.Builder().setEndpoint(WebUtils.BASE_API_URL).setClient(new retrofit.client.OkClient()).setRequestInterceptor(requestInterceptor).build();
    return restAdapter.create(com.cs410.android.util.CourseAppApi.class);
}