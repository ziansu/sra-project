public static <TModel> com.fuzz.datacontroller.source.DataSource.Builder<TModel> builderInstance(java.lang.Class<TModel> modelClass, boolean async) {
    com.fuzz.datacontroller.dbflow.DBFlowSingleSource<TModel> source = new com.fuzz.datacontroller.dbflow.DBFlowSingleSource<>(modelClass, async);
    return new com.fuzz.datacontroller.source.DataSource.Builder<>(source, DataSource.SourceType.DISK);
}