public static void makeRequest(java.lang.String codeSection, java.lang.String regId, final org.esn.mobilit.utils.callbacks.Callback<retrofit.client.Response> callback) {
    org.esn.mobilit.network.providers.PostRegProvider.PostRegServiceInterface postRegService = org.esn.mobilit.network.providers.PostRegProvider.restAdapter.create(org.esn.mobilit.network.providers.PostRegProvider.PostRegServiceInterface.class);
    postRegService.registerId(regId, codeSection, ApplicationConstants.MOBILIT_TOKEN, new retrofit.Callback<retrofit.client.Response>() {
        @java.lang.Override
        public void success(retrofit.client.Response s, retrofit.client.Response response) {
            callback.onSuccess(s);
        }

        @java.lang.Override
        public void failure(retrofit.RetrofitError error) {
            callback.onFailure(error.getMessage());
        }
    });
}