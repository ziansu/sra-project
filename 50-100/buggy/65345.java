public static <CTX, T> com.enelson.monads.Reader<CTX, ? extends javaslang.collection.Seq<T>> sequence(javaslang.collection.Seq<com.enelson.monads.Reader<CTX, T>> readers) {
    return new com.enelson.monads.Reader((CTX ctx) -> {
        List<com.enelson.monads.T> list = javaslang.collection.List.empty();
        for (Reader<com.enelson.monads.CTX, com.enelson.monads.T> r : readers) {
            list = list.append(r.apply(ctx));
        }
        return list;
    });
}