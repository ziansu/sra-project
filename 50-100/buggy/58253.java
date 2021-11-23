@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.user_info_update :
            uplaodImage(mImagePath);
            break;
        case R.id.user_icon_image :
            mBmpFactory.OpenGallery();
            break;
        case R.id.user_location_rl :
            android.content.Intent intent = new android.content.Intent(mContext, com.bishe.ui.activity.MyLoactionActivity.class);
            mContext.startActivityForResult(intent, Constant.GET_LOCATION);
        default :
            break;
    }
}