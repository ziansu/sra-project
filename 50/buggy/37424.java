@java.lang.Override
public void gotResult(int responseCode, java.lang.String responseMsg, java.util.List<java.lang.Long> list) {
    if (responseCode == 0) {
        callback.success(mGson.toJson(list));
    }else {
        callback.error(responseMsg);
    }
}