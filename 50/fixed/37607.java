public static void confApi(android.content.Context context) {
    if (com.subang.api.SubangAPI.isConfed()) {
        return ;
    }
    com.subang.worker.util.AppUtil.conf(context);
    com.subang.api.SubangAPI.conf(WebConst.WORKER, AppConf.cellnum, AppConf.basePath);
}