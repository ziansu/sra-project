public java.util.List<by.dzmitry.model.entities.Tag> filter(java.util.List<by.dzmitry.model.entities.Tag> tags, java.lang.Object predicate) {
    java.util.List<by.dzmitry.model.entities.Tag> filtered = new java.util.ArrayList<>();
    for (by.dzmitry.model.entities.Tag tag : tags) {
        if (!(tag.getName().equals(tag.getName().toUpperCase()))) {
            filtered.add(tag);
        }
    }
    return filtered;
}