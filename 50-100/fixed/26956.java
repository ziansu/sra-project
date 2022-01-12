public org.gradoop.common.model.impl.pojo.Vertex createVertexFromBranch(org.eclipse.jgit.lib.Ref branch) {
    org.gradoop.common.model.impl.pojo.Vertex v = vertices.get(branch.getName());
    if (v != null) {
        return v;
    }
    org.gradoop.common.model.impl.properties.Properties props = new org.gradoop.common.model.impl.properties.Properties();
    props.set("name", branch.getName());
    v = config.getVertexFactory().createVertex(gradoopify.GradoopFiller.branchVertexLabel, props);
    vertices.put(branch.getName(), v);
    return v;
}