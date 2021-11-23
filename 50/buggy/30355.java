public static <E, O> ca.odell.glazedlists.matchers.SetMatcherEditor<E, O> create(final ca.odell.glazedlists.FunctionList.Function<E, O> fn) {
    return ca.odell.glazedlists.matchers.SetMatcherEditor.create(fn, ca.odell.glazedlists.matchers.SetMatcherEditor.Mode.EMPTY_MATCHES_NONE);
}