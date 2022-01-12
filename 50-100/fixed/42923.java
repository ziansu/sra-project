private <Data, ResourceType> com.bumptech.glide.load.engine.Resource<R> runLoadPath(Data data, com.bumptech.glide.load.DataSource dataSource, com.bumptech.glide.load.engine.LoadPath<Data, ResourceType, R> path) throws com.bumptech.glide.load.engine.GlideException {
    com.bumptech.glide.load.Options options = getOptionsWithHardwareConfig(dataSource);
    com.bumptech.glide.load.data.DataRewinder<Data> rewinder = glideContext.getRegistry().getRewinder(data);
    try {
        return path.load(rewinder, options, width, height, new DecodeCallback<ResourceType>(dataSource));
    } finally {
        rewinder.cleanup();
    }
}