@java.lang.Override
public void run() {
    if ((mCropPhoto) != null) {
        com.pkjiao.friends.mm.common.CommonDataStructure.UploadHeadPicResultEntry resultEntry = com.pkjiao.friends.mm.utils.Utils.uploadHeadPicBitmap(CommonDataStructure.URL_UPLOAD_HEAD_PIC, uid, mCropPhoto, mCropPhotoName);
        if (!(isUidExistInHeadPicDB(uid))) {
            insertHeadPicToHeadPicsDB(resultEntry);
        }else {
            updateHeadPicToHeadPicsDB(resultEntry);
        }
    }
    mHandler.sendEmptyMessage(com.pkjiao.friends.mm.activity.FillUserInfoActivity.UPLOAD_USER_HEADER_FINISH);
}