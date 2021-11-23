private synchronized void writeAllAux(java.util.Collection<blackboard.IdentifiableElement> elems) {
    for (blackboard.IdentifiableElement e : elems) {
        if (area.containsKey(e.getId())) {
        }
        area.put(e.getId(), e);
    }
}