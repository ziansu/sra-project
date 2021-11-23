@org.testng.annotations.Test(groups = { "jpa" }, dependsOnMethods = { "test_createSliceKind" })
public void test_createSlice() {
    de.zib.gndms.dspace.service.SubspaceServiceImpl subspaceService = new de.zib.gndms.dspace.service.SubspaceServiceImpl();
    de.zib.gndms.gndmc.dspace.SubspaceProviderImpl subspaceProvider = new de.zib.gndms.gndmc.dspace.SubspaceProviderImpl(emf);
    de.zib.gndms.gndmc.dspace.SliceKindProviderImpl sliceKindProvider = new de.zib.gndms.gndmc.dspace.SliceKindProviderImpl(emf);
    de.zib.gndms.gndmc.dspace.SliceProviderImpl sliceProvider = new de.zib.gndms.gndmc.dspace.SliceProviderImpl(emf);
    sliceProvider.setSubspaceProvider(subspaceProvider);
    sliceProvider.setSliceKindProvider(sliceKindProvider);
    subspaceService.setEmf(emf);
    subspaceService.setSubspaceProvider(subspaceProvider);
    subspaceService.setSliceProvider(sliceProvider);
    subspaceService.createSlice("sub", "kind", "deadline:2011-12-16; sliceSize:1024", "root");
}