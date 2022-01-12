private void initFiles() throws java.lang.Exception {
    java.lang.String url;
    java.lang.String type;
    switch (kvHelper.get().getInt("host.type", R.id.btn_setting_home_dropbox)) {
        case R.id.btn_setting_home_dropbox :
            type = "dropbox";
            url = com.odong.buddhismhomework.Config.DROPBOX_FILE_LST;
            break;
        default :
            throw new java.io.IOException(getString(R.string.lbl_no_valid_host));
    }
    android.util.Log.d("文件列表", files.toString());
}