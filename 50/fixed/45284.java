public static <S> com.ljs.ai.search.hillclimbing.Heuristic<S> from(com.google.common.collect.Ordering<S> ordering) {
    return ordering::compare;
}