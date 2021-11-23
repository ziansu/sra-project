public void removeCustomNodes(java.lang.Long requirementId) {
    savedNodes.get(requirementId).clear();
    savedNodes.remove(requirementId);
}