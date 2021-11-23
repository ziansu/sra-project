private synchronized void setCounterSync(java.lang.String accountId, java.lang.String url, java.lang.Integer value) {
    java.util.Map<java.lang.String, java.lang.Integer> stats = repository.get(accountId);
    if (stats == null) {
        stats = new java.util.HashMap<>();
        stats.put(url, value);
    }else {
        stats.compute(url, ( existedUrl, counter) -> value);
    }
    repository.put(accountId, stats);
}