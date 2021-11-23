@java.lang.Override
public java.lang.Boolean call(com.google.gson.JsonObject jsonObject) {
    android.util.Log.d("sfparks parksModule", "about to filter 1");
    return !((jsonObject == null) || ((jsonObject.get(com.sfparks.model.ParksModule.LOCATION_1)) == null));
}