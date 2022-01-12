public static <T extends util.RegisteredEntity> java.util.List<T> getAll(java.lang.Class<T> c) {
    if (util.RegisteredEntity.ALL.containsKey(c)) {
        return ((java.util.List) (util.RegisteredEntity.ALL.get(c)));
    }else {
        return new java.util.LinkedList();
    }
}