public static com.tomeokin.lspush.common.SMSCaptchaUtils init(android.content.Context context, java.lang.String smsId, java.lang.String smsKey) {
    if ((com.tomeokin.lspush.common.SMSCaptchaUtils.sInstance) == null) {
        com.tomeokin.lspush.common.SMSCaptchaUtils.sInstance = new com.tomeokin.lspush.common.SMSCaptchaUtils(context, smsId, smsKey);
    }
    return com.tomeokin.lspush.common.SMSCaptchaUtils.sInstance;
}