public boolean hasComponents() {
    java.util.List<it.uniud.ailab.dcore.persistence.DocumentComponent> comps = getComponents();
    return (comps != null) && ((comps.size()) > 0);
}