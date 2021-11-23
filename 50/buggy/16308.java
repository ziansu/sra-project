@java.lang.Override
public void onResponse(retrofit.Response<java.util.List<smartfoxlabs.shoplist.entities.ShopItem>> response, retrofit.Retrofit retrofit) {
    caseCallback.onSuccess(response.body());
}