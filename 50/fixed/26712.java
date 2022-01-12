@java.lang.Override
public void onCancelled(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo) {
    cb.failed("上传失败");
}