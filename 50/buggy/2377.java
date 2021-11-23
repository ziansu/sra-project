@java.lang.Override
public void gotResult(int responseCode, java.lang.String responseMsg, cn.jpush.im.android.api.model.GroupInfo groupInfo) {
    if (responseCode == 0) {
        callback.success(mGson.toJson(groupInfo));
    }else {
        callback.error(responseMsg);
    }
}