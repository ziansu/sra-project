public com.hitomi.tilibrary.transfer.Transferee apply(com.hitomi.tilibrary.transfer.TransferConfig config) {
    if (!(shown)) {
        transConfig = config;
        checkConfig();
        transLayout.apply(config);
    }
    return com.hitomi.tilibrary.transfer.Transferee.defaultInstance;
}