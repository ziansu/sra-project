@java.lang.Override
public void gotResult(int responseCode, java.lang.String responseDesc) {
    if (responseCode == 0) {
        callback.success();
    }else {
        callback.error(responseCode);
    }
}