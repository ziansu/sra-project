public static int getAppContentHeight(android.app.Activity paramActivity) {
    return ((unique.fancysherry.pigeons.util.system.ScreenUtils.getScreenHeight()) - (unique.fancysherry.pigeons.util.system.ScreenUtils.getStatusBarHeight())) - (unique.fancysherry.pigeons.util.system.ScreenUtils.getKeyboardHeight(paramActivity));
}