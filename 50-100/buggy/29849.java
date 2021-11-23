@android.support.annotation.NonNull
private static java.io.File getBookmarkPage(@android.support.annotation.NonNull
android.app.Application application, @android.support.annotation.Nullable
java.lang.String folder) {
    java.lang.String prefix = (!(android.text.TextUtils.isEmpty(folder))) ? folder + '-' : "";
    return new java.io.File(application.getFilesDir(), (prefix + (acr.browser.lightning.constant.BookmarkPage.FILENAME)));
}