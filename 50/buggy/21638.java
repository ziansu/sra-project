public void select(java.util.Set<edu.stanford.nlp.sempre.interactive.actions.Item> set) {
    selected = com.google.common.collect.Sets.newHashSet();
    selected.addAll(set);
    selected.retainAll(allitems);
}