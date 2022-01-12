public void addTag(br.com.codecode.workix.jpa.models.Tag tag) {
    if ((tags) == null) {
        tags = new java.util.HashSet<>();
    }
    tags.add(tag);
}