@java.lang.Override
public void run() {
    com.ggstudios.lolcraft.SplashFetcher.FetchToken token = com.ggstudios.lolcraft.SplashFetcher.getInstance().fetchChampionSplash(((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.HONEYCOMB) ? com.ggstudios.lolcraft.MainFragment.THREAD_POOL_EXECUTOR : null), holder.lastInfo.key, holder.splash.getWidth(), 0, new com.ggstudios.lolcraft.SplashFetcher.OnDrawableRetrievedListener() {
        @java.lang.Override
        public void onDrawableRetrieved(android.graphics.drawable.Drawable d) {
            holder.lastToken = null;
            holder.splash.setImageDrawable(d);
            fadeViewIn(holder.splash);
        }
    });
    holder.lastToken = token;
}