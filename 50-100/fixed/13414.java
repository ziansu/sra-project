private boolean isMediaMessage(cn.jpush.im.android.api.model.Message msg) {
    return (((msg.getContentType()) == (cn.jpush.im.android.api.enums.ContentType.image)) || ((msg.getContentType()) == (cn.jpush.im.android.api.enums.ContentType.voice))) || ((msg.getContentType()) == (cn.jpush.im.android.api.enums.ContentType.video));
}