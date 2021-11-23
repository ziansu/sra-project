public static com.google.common.collect.ImmutableSet<google.registry.model.registry.label.PremiumList.PremiumListEntry> parentPremiumListEntriesOnRevision(java.lang.Iterable<google.registry.model.registry.label.PremiumList.PremiumListEntry> entries, final com.googlecode.objectify.Key<google.registry.model.registry.label.PremiumList.PremiumListRevision> revisionKey) {
    return com.google.common.collect.FluentIterable.from(entries).transform(new com.google.common.base.Function<google.registry.model.registry.label.PremiumList.PremiumListEntry, google.registry.model.registry.label.PremiumList.PremiumListEntry>() {
        @java.lang.Override
        public google.registry.model.registry.label.PremiumList.PremiumListEntry apply(google.registry.model.registry.label.PremiumList.PremiumListEntry entry) {
            return entry.asBuilder().setParent(revisionKey).build();
        }
    }).toSet();
}