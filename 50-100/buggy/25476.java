private nl.defsoftware.mrgb.models.Rib next(nl.defsoftware.mrgb.models.Rib v) {
    if (((v.getNodeId()) + 1) < (candidates.size())) {
        return candidates.get(((v.getNodeId()) + 1));
    }
    return null;
}