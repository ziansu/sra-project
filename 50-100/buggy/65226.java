public void destroy() {
    this.destroyLogics();
    this.commitLog.destroy();
    this.indexService.destroy();
    this.deleteFile(com.alibaba.rocketmq.store.config.StorePathConfigHelper.getAbortFile(this.messageStoreConfig.getStorePathRootDir()));
    this.deleteFile(com.alibaba.rocketmq.store.config.StorePathConfigHelper.getStoreCheckpoint(this.messageStoreConfig.getStorePathRootDir()));
}