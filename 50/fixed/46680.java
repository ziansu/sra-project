public static com.pqqqqq.escript.lang.data.store.list.SimpleListModule fromLiterals(java.util.Collection<com.pqqqqq.escript.lang.data.Literal> col) {
    com.pqqqqq.escript.lang.data.store.list.SimpleListModule list = com.pqqqqq.escript.lang.data.store.list.SimpleListModule.from();
    col.stream().map(SimpleMutableValue::from).forEach(list::add);
    return list;
}