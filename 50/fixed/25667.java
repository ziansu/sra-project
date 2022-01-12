public static <T> com.darylteo.vertx.promises.java.Promise<T> rejected(java.lang.Throwable reason) {
    com.darylteo.vertx.promises.java.Promise<T> promise = new com.darylteo.vertx.promises.java.Promise();
    promise.reject((reason instanceof java.lang.Exception ? reason : new java.lang.Exception(reason)));
    return promise;
}