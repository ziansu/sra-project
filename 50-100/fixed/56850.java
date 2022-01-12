@java.lang.Override
public void createImporters(org.polymap.p4.data.importer.raster.ImporterBuilder builder) throws java.lang.Exception {
    if (((file) != null) && (org.polymap.p4.data.importer.raster.RasterImporterFactory.isSupported(file))) {
        builder.newImporter(new org.polymap.p4.data.importer.raster.RasterImporter(), file);
    }else
        if ((files) != null) {
            for (java.io.File f : files) {
                if (org.polymap.p4.data.importer.raster.RasterImporterFactory.isSupported(f)) {
                    builder.newImporter(new org.polymap.p4.data.importer.raster.RasterImporter(), f);
                }
            }
        }
    
}