private org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.MatchBuilder createIpProtocolMatch(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.MatchBuilder matchBuilder, short ipProtocol) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatchBuilder ipMmatch = new org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatchBuilder();
    if (ipProtocol == (org.opendaylight.faas.fabrics.vxlan.adapters.ovs.pipeline.PipelineAclHandler.PROTOCOL_TCP)) {
        ipMmatch.setIpProtocol(org.opendaylight.faas.fabrics.vxlan.adapters.ovs.pipeline.PipelineAclHandler.PROTOCOL_TCP);
    }else
        if (ipProtocol == (org.opendaylight.faas.fabrics.vxlan.adapters.ovs.pipeline.PipelineAclHandler.PROTOCOL_UDP)) {
            ipMmatch.setIpProtocol(org.opendaylight.faas.fabrics.vxlan.adapters.ovs.pipeline.PipelineAclHandler.PROTOCOL_UDP);
        }else
            if (ipProtocol == (org.opendaylight.faas.fabrics.vxlan.adapters.ovs.pipeline.PipelineAclHandler.PROTOCOL_ICMP)) {
                ipMmatch.setIpProtocol(org.opendaylight.faas.fabrics.vxlan.adapters.ovs.pipeline.PipelineAclHandler.PROTOCOL_ICMP);
            }else {
                ipMmatch.setIpProtocol(ipProtocol);
            }
        
    
    matchBuilder.setIpMatch(ipMmatch.build());
    return matchBuilder;
}