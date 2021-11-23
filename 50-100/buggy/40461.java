private org.bladerunnerjs.model.engine.Node findFirstNodeOfClass(java.util.List<org.bladerunnerjs.model.engine.Node> nodes, java.lang.Class<? extends org.bladerunnerjs.model.engine.Node> nodeClass) {
    for (org.bladerunnerjs.model.engine.Node n : nodes) {
        if ((nodeClass == null) || (nodeClass.isAssignableFrom(n.getClass()))) {
            return n;
        }
    }
    return null;
}