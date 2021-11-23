public void startService() {
    data.GankDataHanlder hanlder = new data.GankDataHanlder();
    try {
        java.util.List<model.GankItem> items = hanlder.loadGankItems(false);
        buildSearchIndex(items);
        logger.info("gankhub start service");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}