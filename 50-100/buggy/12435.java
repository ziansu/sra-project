private void updateOriginalTags() {
    modifiedTags = getExistingTags();
    for (java.lang.String tagToAdd : tagsToAdd) {
        boolean hasTag = false;
        for (java.lang.String existingTag : originalTags) {
            if (tagToAdd.equalsIgnoreCase(existingTag)) {
                hasTag = true;
            }
            if (!hasTag) {
                modifiedTags.add(tagToAdd);
            }
        }
    }
}