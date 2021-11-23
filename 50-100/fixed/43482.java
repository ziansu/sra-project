private fi.thl.pivot.model.DimensionNode findNodeByNameInLevel(fi.thl.pivot.model.DimensionLevel level, java.lang.String item, java.lang.String language) {
    if (null == level) {
        return null;
    }
    for (fi.thl.pivot.model.DimensionNode n : level.getNodes()) {
        if (item.equals(n.getLabel().getValue(language))) {
            return n;
        }
    }
    return findNodeByNameInLevel(level.getChildLevel(), item, language);
}