@java.lang.Override
public void fetchAuthToken(io.github.xwz.base.api.EpisodeBaseModel episode) {
    android.util.Log.d(io.github.xwz.sbs.content.ContentManager.TAG, "fetchAuthToken");
    cache().broadcastChange(io.github.xwz.sbs.content.CONTENT_AUTH_FETCHING, episode.getHref());
    new io.github.xwz.sbs.api.SBSAuthApi(getContext(), episode.getHref()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, episode.getHref());
}