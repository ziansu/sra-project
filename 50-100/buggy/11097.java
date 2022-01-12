@java.lang.Override
public N getNodeAt(int index) {
    int sourceNodeCount = sourceNodes.size();
    if (((sourceNodes) != null) && (index < sourceNodeCount)) {
        return sourceNodes.get(index);
    }
    if ((sinkNodes) != null) {
        int sinkIndex = ((sourceNodes) == null) ? index : index - sourceNodeCount;
        return sinkNodes.get(sinkIndex);
    }
    throw new java.lang.IndexOutOfBoundsException();
}