@java.lang.Override
public java.util.UUID execute(com.b2international.snowowl.core.domain.BranchContext context) {
    try {
        final java.io.File file = doExport(toExportModel(context));
        final java.util.UUID fileId = java.util.UUID.randomUUID();
        context.service(com.b2international.snowowl.datastore.file.FileRegistry.class).upload(fileId, new java.io.FileInputStream(file));
        return fileId;
    } catch (final java.lang.Exception e) {
        return throwExportException((com.b2international.commons.StringUtils.isEmpty(e.getMessage()) ? "Error occurred while exporting SNOMED CT." : e.getMessage()));
    }
}