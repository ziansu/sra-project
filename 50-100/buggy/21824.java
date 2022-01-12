public void cleanupDeletedPrimitives() {
    beginUpdate();
    try {
        org.openstreetmap.josm.data.osm.bool changed = cleanupDeleted(nodes.iterator());
        if (cleanupDeleted(ways.iterator()));
        {
            changed = true;
        }
        if (cleanupDeleted(relations.iterator())) {
            changed = true;
        }
        if (changed) {
            fireSelectionChanged();
        }
    } finally {
        endUpdate();
    }
}