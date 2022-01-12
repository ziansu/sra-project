public T get(T model) {
    T modelFromCollection = null;
    if (model != null) {
        modelFromCollection = byId.get(java.lang.String.valueOf(model.getId()));
        if ((modelFromCollection == null) || ((model.getId()) == (-1)))
            modelFromCollection = byId.get(model.getCid());
        
    }
    return modelFromCollection;
}