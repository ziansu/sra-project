public static void dataTest() {
    pt.uminho.sysbio.biosynthframework.kbase.KBaseSbmlImporter.DATA_EXPORT_PATH = sbmltools.test.LocalTest.a;
    pt.uminho.sysbio.biosynthframework.kbase.KBaseSbmlImporter.CURATION_DATA = sbmltools.test.LocalTest.b;
    pt.uminho.sysbio.biosynthframework.kbase.KBaseSbmlImporter.LOCAL_CACHE = "/tmp/argonne";
    try {
        pt.uminho.sysbio.biosynthframework.kbase.KBaseSbmlImporter sbmlTools = new pt.uminho.sysbio.biosynthframework.kbase.KBaseSbmlImporter(null, null, null);
        sbmltools.SbmlImportParams params = new sbmltools.SbmlImportParams().withAssemblyInputRef("111").withMinLength(10L).withUrl("url");
        pt.uminho.sysbio.biosynthframework.kbase.KBaseSbmlImporter.ImportModelResult result = sbmlTools.debugThings(params);
        java.lang.System.out.println(result.message);
    } catch (us.kbase.common.service.UnauthorizedException | java.io.IOException e) {
        e.printStackTrace();
    }
}