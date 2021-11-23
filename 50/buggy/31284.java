@java.lang.Override
public com.sfparks.model.Park call(com.google.gson.JsonObject object) {
    android.util.Log.d("sfparks parksModule", "getting park from record");
    return com.sfparks.model.ParksModule.getParkFromRecord(object, jsonParser, latLng);
}