@java.lang.Override
public void onResponse(@android.support.annotation.NonNull
android.content.Context ctx, com.cardinfolink.madgazescan.model.StateModel<java.util.ArrayList<com.cardinfolink.madgazescan.model.UserModel>> data) {
    java.lang.String userId = null;
    if (((data != null) & ((data.getStatus()) == (com.cardinfolink.madgazescan.api.ResponseCode.SUCCESS))) & (com.cardinfolink.madgazescan.utils.CollectionUtils.isValid(data.getData()))) {
        userId = data.getData().get(0).getUserId();
    }
    java.lang.String url = generateGlassUrl(merchantCode, userId);
    startWebActivity(url);
}