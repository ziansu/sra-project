private VariantProto.Variant convert(org.opencb.opencga.server.grpc.Variant var) {
    org.opencb.biodata.models.variant.protobuf.VariantProto.Variant build = VariantProto.Variant.newBuilder().setChromosome(var.getChromosome()).setStart(var.getStart()).setEnd(var.getEnd()).setLength(var.getLength()).setReference(var.getReference()).setAlternate(var.getAlternate()).build();
    return build;
}