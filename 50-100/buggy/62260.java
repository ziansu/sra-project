public void reset(android.content.Context context, ar.rulosoft.mimanganu.componentes.Manga manga, ar.rulosoft.mimanganu.servers.ServerBase s) {
    java.lang.String path = ar.rulosoft.mimanganu.services.DownloadPoolService.generateBasePath(s, manga, this, context);
    new ar.rulosoft.mimanganu.componentes.Chapter.DeleteImages(new java.io.File(path)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    setPages(0);
    setDownloaded(false);
    setPagesRead(0);
    ar.rulosoft.mimanganu.componentes.Database.updateChapterPlusDownload(context, this);
}