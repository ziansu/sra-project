public void request(org.epics.pvdata.pv.PVStructure pvArgument, org.epics.pvaClient.PvaClientRPCRequester pvaClientRPCRequester) {
    this.pvaClientRPCRequester = pvaClientRPCRequester;
    channelRPC.request(pvArgument);
}