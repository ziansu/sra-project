@java.lang.Override
public void onChange(com.androidsdk.snaphy.snaphyandroidsdk.list.DataList<java.util.Map<java.lang.String, java.lang.Object>> dataList) {
    boolean done = true;
    for (com.orthopg.snaphy.orthopg.CustomModel.TrackImage trackImage : trackImages) {
        if (!(trackImage.isDownloaded())) {
            done = false;
        }
    }
    if (done) {
        callback.onSuccess(postImages);
        callback.onFinally();
    }
}