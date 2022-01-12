public void removeFilter(com.raizlabs.android.coreutils.functions.Predicate<T> filter) {
    this.filters.removePredicate(filter);
    update();
}