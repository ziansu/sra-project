@java.lang.Override
protected void configure() {
    java.lang.String storageType = configuration.getString("storage.type", "local");
    switch (storageType) {
        case "mock" :
            bind(modules.storage.Storage.class).to(modules.storage.MockStorage.class);
            break;
        case "local" :
            bind(modules.storage.Storage.class).to(modules.storage.LocalFilesystemStorage.class);
            break;
        case "s3" :
            bind(modules.storage.Storage.class).to(modules.storage.AmazonS3Storage.class);
            break;
        default :
            break;
    }
}