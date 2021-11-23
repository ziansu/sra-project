@android.support.annotation.WorkerThread
@java.lang.Override
public void run() {
    com.github.miao1007.animewallpaper.support.GlobalContext.startThirdFrameWork();
    repo = com.github.miao1007.animewallpaper.utils.SquareUtils.getRetrofit(DanbooruAPI.KONACHAN).create(com.github.miao1007.animewallpaper.support.api.konachan.DanbooruAPI.class);
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            onRefresh();
        }
    });
}