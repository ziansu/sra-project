public T get(T model) {
    T modelFromCollection = null;
    if (model != null) {
        modelFromCollection = byId.get(java.lang.String.valueOf(model.getId()));
        if (modelFromCollection == null)
            modelFromCollection = byId.get(model.getCid());
        
    }
    return modelFromCollection;
}