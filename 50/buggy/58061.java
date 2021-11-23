public static void error(java.lang.String msg) {
    if (msg != null) {
        play.mvc.Controller.flash(services.FlashScopeMessaging.ERROR);
    }
}