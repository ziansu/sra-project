public com.github.onsdigital.zebedee.json.ContentDetail clone() {
    com.github.onsdigital.zebedee.json.ContentDetail cloned = new com.github.onsdigital.zebedee.json.ContentDetail(this.description.title, this.uri, this.type);
    if ((this.children) != null) {
        cloned.children = new java.util.ArrayList<>(this.children.size());
        this.children.forEach(( child) -> cloned.children.add(child.clone()));
    }
    return cloned;
}