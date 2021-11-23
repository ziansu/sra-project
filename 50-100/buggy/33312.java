public MapValue computeIfAbsent(@javax.annotation.Nonnull
KeySequence keyItems, @javax.annotation.Nonnull
java.util.function.Supplier<MapValue> valueSupplier) {
    final com.opentable.data.structures.SequenceMap<KeySequence, KeyItem, MapValue>.TreeNode node = getOrCreatePath(keyItems);
    if (!(node.getTarget().isPresent())) {
        node.setTarget(valueSupplier.get());
    }
    return node.getTarget().get();
}