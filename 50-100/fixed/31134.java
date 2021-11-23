static tc.oc.pgm.kits.KitNode of(java.util.stream.Stream<tc.oc.pgm.kits.Kit> kits) {
    return new tc.oc.pgm.kits.KitNodeImpl(java.util.stream.Stream.empty(), new tc.oc.pgm.compose.All<tc.oc.pgm.kits.Kit>(kits.map(Unit::new)), tc.oc.pgm.filters.matcher.StaticFilter.ALLOW, java.util.Optional.empty(), java.util.Optional.empty());
}