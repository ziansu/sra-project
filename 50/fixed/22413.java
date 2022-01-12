@java.lang.Override
public void onError(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo, net.gotev.uploadservice.ServerResponse serverResponse, java.lang.Exception exception) {
    cb.failed("上传失败");
}