public static void success(java.lang.String msg) {
    if (msg != null) {
        play.mvc.Controller.flash(services.FlashScopeMessaging.SUCCESS, msg);
    }
}