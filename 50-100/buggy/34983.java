@java.lang.Override
public void getStoresList(final smartfoxlabs.shoplist.callbacks.UseCaseCallback<java.util.List<smartfoxlabs.shoplist.entities.Store>> caseCallback) {
    mShopApi.getStores().enqueue(new retrofit.Callback<java.util.List<smartfoxlabs.shoplist.entities.Store>>() {
        @java.lang.Override
        public void onResponse(retrofit.Response<java.util.List<smartfoxlabs.shoplist.entities.Store>> response, retrofit.Retrofit retrofit) {
            caseCallback.onSuccess(response.body());
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable t) {
            caseCallback.onError(t);
        }
    });
}