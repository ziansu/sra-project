@org.neo4j.ogm.annotation.Relationship(type = "author", direction = org.neo4j.ogm.annotation.Relationship.INCOMING)
public java.util.List<org.reactome.server.graph.domain.model.Person> getAuthor() {
    if ((author) == null)
        return null;
    
    java.util.List<org.reactome.server.graph.domain.model.Person> rtn = new java.util.ArrayList<>();
    for (org.reactome.server.graph.domain.relationship.PublicationAuthor author : this.author) {
        rtn.add(author.getAuthor());
    }
    return rtn;
}