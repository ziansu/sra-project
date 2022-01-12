private void getNamesEmbeddedFiles(java.util.List<java.lang.Object> files, org.verapdf.model.impl.pb.cos.COSDictionary buffer) throws java.io.IOException {
    org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode root = new org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode(buffer);
    final java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification> names = root.getNames();
    if (names != null) {
        final java.util.Set<java.util.Map.Entry<java.lang.String, org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification>> entries = names.entrySet();
        for (java.util.Map.Entry<java.lang.String, org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification> entry : entries) {
            files.add(new org.verapdf.model.impl.pb.cos.PBCosFileSpecification(entry.getValue().getCOSObject()));
        }
    }
}