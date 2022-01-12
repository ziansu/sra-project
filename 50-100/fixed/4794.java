public void setNewChildTagId(java.lang.Long newChildTagId) {
    if (newChildTagId == null)
        return ;
    
    if (com.civilizer.domain.Tag.isTrivialTag(newChildTagId)) {
        final int index = indexOf(newChildTagId);
        if (childTags.equals(java.util.Collections.emptyList())) {
            childTags = new java.util.ArrayList<>();
        }
        childTags.add(tags.get(index));
        hierarchyTouched = true;
    }
}