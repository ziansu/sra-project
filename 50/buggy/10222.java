public eu.transkribus.core.model.beans.TrpUpload uploadTrpDoc(final int colId, eu.transkribus.core.model.beans.TrpDoc doc, org.eclipse.core.runtime.IProgressMonitor monitor) throws java.lang.Exception {
    return uploadTrpDoc(colId, doc, UploadType.JSON, monitor, null);
}