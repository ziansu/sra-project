@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.avos.avoscloud.AVOSCloud.initialize(this, "m7baukzusy3l5coew0b3em5uf4df5i2krky0ypbmee358yon", "2e46velw0mqrq3hl2a047yjtpxn32frm0m253k258xo63ft9");
    com.avos.avoscloud.im.v2.AVIMMessageManager.registerMessageHandler(com.avos.avoscloud.im.v2.AVIMTypedMessage.class, new com.leancloud.im.guide.MessageHandler(this));
}