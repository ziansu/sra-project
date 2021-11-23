public static io.reactivex.functions.Predicate<com.github.e13mort.stf.model.device.Device> provider(com.github.e13mort.stf.adapter.filters.ProviderDescription description) {
    return new com.github.e13mort.stf.adapter.filters.ProviderPredicate(description.getType(), description.getTemplates());
}