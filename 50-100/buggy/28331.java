private synchronized void writeAllAux(java.util.Collection<blackboard.IdentifiableElement> elems) {
    for (blackboard.IdentifiableElement e : elems) {
        if (area.containsKey(e.getId())) {
            java.lang.System.out.println(((("--->" + (area.get(e.getId()))) + " is being overwritten by ") + e));
        }
        area.put(e.getId(), e);
    }
}