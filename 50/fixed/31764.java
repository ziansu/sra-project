@java.lang.Override
public org.neo4j.kernel.impl.util.diffsets.ReadableDiffSets<java.lang.Long> addedAndRemovedNodes() {
    return ReadableDiffSets.Empty.ifNull(nodes);
}