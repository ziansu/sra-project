@java.lang.Override
public org.neo4j.kernel.impl.util.diffsets.ReadableDiffSets<java.lang.Long> addedAndRemovedNodes() {
    java.lang.System.out.println("CREATES DIFFSET OF TXSTATE NODES");
    return ReadableDiffSets.Empty.ifNull(nodes);
}