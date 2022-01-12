@java.lang.Override
public void getStoresList(@android.support.annotation.NonNull
final smartfoxlabs.shoplist.callbacks.UseCaseCallback<java.util.List<smartfoxlabs.shoplist.entities.Store>> caseCallback) {
    mShopApi.getStores().enqueue(new retrofit.Callback<java.util.List<smartfoxlabs.shoplist.entities.Store>>() {
        @java.lang.Override
        public void onResponse(retrofit.Response<java.util.List<smartfoxlabs.shoplist.entities.Store>> response, retrofit.Retrofit retrofit) {
            if (caseCallback != null) {
                caseCallback.onSuccess(response.body());
            }
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable t) {
            if (caseCallback != null) {
                caseCallback.onError(t);
            }
        }
    });
}