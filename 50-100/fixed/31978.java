@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.ln.model.CouponTemplate>> call, retrofit2.Response<java.util.List<com.ln.model.CouponTemplate>> response) {
    if ((response.body()) != null) {
        mRealmController.addListCouponTemplate(response.body());
        android.util.Log.d(TAG, ("getCouponTemplateOfShop " + (response.body().size())));
    }else {
        android.util.Log.d(TAG, ("getCouponTemplateOfShop " + "null"));
    }
}