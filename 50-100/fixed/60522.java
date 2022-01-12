@java.lang.Override
public <S extends T> java.util.List<S> update(java.lang.Iterable<S> entities) {
    java.util.List<S> result = new java.util.ArrayList<S>();
    if (entities == null) {
        return result;
    }
    for (S entity : entities) {
        result.add(update(entity));
    }
    return result;
}