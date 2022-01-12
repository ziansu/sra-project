private static <S> com.ljs.ai.search.hillclimbing.Validator<S> from(com.google.common.base.Predicate<S> predicate) {
    return predicate::apply;
}