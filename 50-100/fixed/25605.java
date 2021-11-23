public <T> void seed(com.google.inject.Key<T> key, T value) {
    lombok.val scope = authScope.get();
    if (scope == null) {
        throw new com.google.inject.OutOfScopeException((("Cannot seed " + key) + " outside of a scoping block"));
    }
    com.google.common.base.Preconditions.checkState((!(scope.containsKey(key))), ("A value for the key %s was " + "already seeded in this scope. Old value: %s New value: %s"), key, scope.get(key), value);
    scope.put(key, value);
}