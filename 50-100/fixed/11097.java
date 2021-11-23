@java.lang.Override
public N getNodeAt(int index) {
    if (((sourceNodes) != null) && (index < (sourceNodes.size()))) {
        return sourceNodes.get(index);
    }
    if ((sinkNodes) != null) {
        int sinkIndex = ((sourceNodes) == null) ? index : index - (sourceNodes.size());
        return sinkNodes.get(sinkIndex);
    }
    throw new java.lang.IndexOutOfBoundsException();
}