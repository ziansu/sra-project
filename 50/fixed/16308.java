@java.lang.Override
public void onResponse(retrofit.Response<java.util.List<smartfoxlabs.shoplist.entities.ShopItem>> response, retrofit.Retrofit retrofit) {
    if (caseCallback != null) {
        caseCallback.onSuccess(response.body());
    }
}