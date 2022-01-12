@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof org.openstreetmap.josm.plugins.mapillary.MapillarySequence)
        return this.getKey().equals(((org.openstreetmap.josm.plugins.mapillary.MapillarySequence) (obj)).getKey());
    
    return false;
}