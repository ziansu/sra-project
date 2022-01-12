public static void removeModel(@android.support.annotation.NonNull
com.fin10.android.mywallpaper.model.WallpaperModel model) {
    java.io.File file = new java.io.File(model.getImagePath());
    boolean result = file.delete();
    if (!result) {
        com.fin10.android.mywallpaper.Log.e("failed to delete. %s", model.getImagePath());
        return ;
    }
    long id = model.getId();
    model.delete();
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.fin10.android.mywallpaper.model.WallpaperModel.RemoveEvent(id));
}