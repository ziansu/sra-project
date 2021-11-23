@org.junit.Test
public void testCoreRowTypeSet() {
    org.gbif.ipt.model.Resource resource = new org.gbif.ipt.model.Resource();
    org.gbif.ipt.model.ExtensionMapping mapping = new org.gbif.ipt.model.ExtensionMapping();
    org.gbif.ipt.model.Extension ext = new org.gbif.ipt.model.Extension();
    ext.setRowType(Constants.DWC_ROWTYPE_TAXON);
    mapping.setExtension(ext);
    resource.addMapping(mapping);
    assertEquals(Constants.DWC_ROWTYPE_TAXON, resource.getCoreRowType());
}