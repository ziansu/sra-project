public static void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if (((com.airsaid.mpermissionutils.MPermissionUtils.mRequestCode) != (-1)) && (requestCode == (com.airsaid.mpermissionutils.MPermissionUtils.mRequestCode))) {
        if (com.airsaid.mpermissionutils.MPermissionUtils.verifyPermissions(grantResults)) {
            if ((com.airsaid.mpermissionutils.MPermissionUtils.mOnPermissionListener) != null)
                com.airsaid.mpermissionutils.MPermissionUtils.mOnPermissionListener.onPermissionGranted();
            
        }else {
            if ((com.airsaid.mpermissionutils.MPermissionUtils.mOnPermissionListener) != null)
                com.airsaid.mpermissionutils.MPermissionUtils.mOnPermissionListener.onPermissionDenied();
            
        }
    }
}