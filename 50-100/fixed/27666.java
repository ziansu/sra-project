private void createOrUpdateFile(pl.psnc.dl.wf4ever.dlibra.FlowTests.FileRecord file) throws java.io.IOException, pl.psnc.dl.wf4ever.dlibra.DigitalLibraryException, pl.psnc.dlibra.service.IdNotFoundException {
    java.io.InputStream f = file.open();
    pl.psnc.dl.wf4ever.dlibra.ResourceInfo r1 = dl.createOrUpdateFile(pl.psnc.dl.wf4ever.dlibra.FlowTests.versionURI, pl.psnc.dl.wf4ever.dlibra.FlowTests.w, pl.psnc.dl.wf4ever.dlibra.FlowTests.r, pl.psnc.dl.wf4ever.dlibra.FlowTests.v, file.path, f, file.mimeType);
    f.close();
    assertNotNull(r1);
}