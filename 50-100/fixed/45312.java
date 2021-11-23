@java.lang.Override
public void onCreate() {
    super.onCreate();
    agersant.polaris.PolarisApplication.instance = this;
    agersant.polaris.api.local.OfflineCache.init(this);
    agersant.polaris.api.remote.ServerAPI.init(this);
    agersant.polaris.api.local.LocalAPI.init();
    agersant.polaris.api.API.init(this);
    agersant.polaris.api.remote.DownloadQueue.init(this);
    initMediaPlayerService();
}