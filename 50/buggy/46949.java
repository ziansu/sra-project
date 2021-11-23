@java.lang.Override
public rx.Observable<ModelType> call(ModelType modelType) {
    return mTable.insert(insertModelType);
}