@java.lang.Override
public org.ietr.dftools.algorithm.model.sdf.SDFEdge addEdge(org.ietr.dftools.algorithm.model.sdf.SDFAbstractVertex source, org.ietr.dftools.algorithm.model.sdf.SDFAbstractVertex target) {
    org.ietr.dftools.algorithm.model.sdf.SDFEdge newEdge = super.addEdge(source, target);
    if ((source instanceof org.ietr.dftools.algorithm.model.sdf.esdf.SDFForkVertex) || ((source instanceof org.ietr.dftools.algorithm.model.sdf.esdf.SDFBroadcastVertex) && (!(source instanceof org.ietr.dftools.algorithm.model.sdf.esdf.SDFRoundBufferVertex)))) {
        source.connectionAdded(newEdge);
    }
    if ((target instanceof org.ietr.dftools.algorithm.model.sdf.esdf.SDFJoinVertex) || (target instanceof org.ietr.dftools.algorithm.model.sdf.esdf.SDFRoundBufferVertex)) {
        target.connectionAdded(newEdge);
    }
    return newEdge;
}