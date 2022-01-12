public void getObjectConstructorAsync(java.lang.String className, com.arondor.common.reflection.api.instantiator.InstantiationCallback<com.arondor.common.reflection.noreflect.model.ObjectConstructor> callback) {
    com.arondor.common.reflection.noreflect.model.ObjectConstructor sync = objectConstructorMap.get(className);
    if (sync != null) {
        callback.onSuccess(sync);
    }
    com.arondor.common.reflection.noreflect.model.ObjectConstructorAsync async = objectConstructorAsyncMap.get(className);
    if (async == null) {
        callback.onFailure(new java.lang.IllegalArgumentException(("No async callback for :" + className)));
    }
    async.getObjectConstructor(callback);
}