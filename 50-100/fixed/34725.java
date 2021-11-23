@org.testng.annotations.BeforeGroups(groups = { "live" })
public void setupClient() {
    super.setupClient();
    final org.virtualbox_4_1.VirtualBoxManager manager = getManager();
    com.google.common.base.Function<org.virtualbox_4_1.IMachine, org.jclouds.compute.domain.Image> iMachineToImage = new org.jclouds.virtualbox.functions.IMachineToImage(manager, osVersionMap);
    adapter = new org.jclouds.virtualbox.compute.VirtualBoxComputeServiceAdapter(manager, new org.jclouds.location.suppliers.JustProvider(provider, java.net.URI.create(endpoint), com.google.common.collect.ImmutableSet.<java.lang.String>of()), iMachineToImage);
}