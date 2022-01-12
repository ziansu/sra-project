private nl.defsoftware.mrgb.models.Rib next(nl.defsoftware.mrgb.models.Rib v) {
    for (int i = 0; i < (candidates.size()); i++) {
        if ((candidates.get(i).equals(v)) && ((i + 1) < (candidates.size()))) {
            return candidates.get((i + 1));
        }
    }
    return null;
}