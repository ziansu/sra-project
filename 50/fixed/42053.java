@java.lang.Override
public void onError(java.lang.Throwable arg0) {
    if (0 != defaultView) {
        imageView.setImageDrawable(mContext.getDrawable(defaultView));
        imageView.setTag(R.id.image_type, com.davidinchina.showcode.lightload.load.LightLoad.LOAD_FAILED);
    }
}