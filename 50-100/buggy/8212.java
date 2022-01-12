public static <T> java.util.List<T> async(com.threewks.thundr.gae.objectify.repository.AsyncResult<T>... asyncs) {
    java.util.List<T> results = new java.util.ArrayList<>();
    for (com.threewks.thundr.gae.objectify.repository.AsyncResult<T> async : asyncs) {
        results.add(async.complete());
    }
    return results;
}