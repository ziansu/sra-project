public static <E, O> ca.odell.glazedlists.matchers.SetMatcherEditor<E, O> create(final ca.odell.glazedlists.FunctionList.Function<E, O> fn) {
    return new ca.odell.glazedlists.matchers.SetMatcherEditor<E, O>(fn);
}