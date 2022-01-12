public static <CTX, T> com.enelson.monads.Reader<CTX, ? extends javaslang.collection.Seq<T>> sequence(javaslang.collection.Seq<com.enelson.monads.Reader<CTX, T>> readers) {
    return new com.enelson.monads.Reader<>(( ctx) -> {
        javaslang.collection.List<T> list = javaslang.collection.List.empty();
        for (com.enelson.monads.Reader<CTX, T> r : readers) {
            list = list.append(r.apply(ctx));
        }
        return list;
    });
}