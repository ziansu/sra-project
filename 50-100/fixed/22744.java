@org.junit.Test
public void testDefaultCustomBidderSetup() {
    org.spectrumauctions.sats.core.model.srvm.SingleRegionModel model = new org.spectrumauctions.sats.core.model.srvm.SingleRegionModel();
    org.spectrumauctions.sats.core.model.srvm.SRVMWorld world = model.createWorld(983742L);
    java.util.List<org.spectrumauctions.sats.core.model.srvm.SRVMBidder> defaultPopulation = model.createPopulation(world);
    org.junit.Assert.assertEquals(defaultPopulation.size(), 7);
}