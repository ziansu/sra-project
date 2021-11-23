@java.lang.Override
public void setId(java.lang.String id) {
    if ((id != null) && (!(id.isEmpty()))) {
        de.hu_berlin.u.saltnpepper.graph.Identifier identifier = de.hu_berlin.u.saltnpepper.graph.GraphFactory.createIdentifier(this, id);
    }
}