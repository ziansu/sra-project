@Kroll.method
@Kroll.setProperty
public void setBigPicture(java.lang.Object picture) {
    org.appcelerator.titanium.view.TiDrawableReference source = org.appcelerator.titanium.view.TiDrawableReference.fromObject(this.getActivity(), picture);
    if (hasProperty(TiC.PROPERTY_DECODE_RETRIES)) {
        source.setDecodeRetries(org.appcelerator.titanium.util.TiConvert.toInt(getProperty(TiC.PROPERTY_DECODE_RETRIES), TiDrawableReference.DEFAULT_DECODE_RETRIES));
    }
    ((android.support.v4.app.NotificationCompat.BigPictureStyle) (style)).bigPicture(source.getBitmap());
    setProperty(TiC.PROPERTY_BIG_PICTURE, picture);
}