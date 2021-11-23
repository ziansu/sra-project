public void retrieve(java.io.File f) throws java.io.IOException, java.lang.InterruptedException {
    org.dcm4che3.data.Attributes attrs = new org.dcm4che3.data.Attributes();
    try (org.dcm4che3.io.DicomInputStream dis = new org.dcm4che3.io.DicomInputStream(f)) {
        attrs.addSelected(dis.readDataset((-1), (-1)), inFilter);
    }
    attrs.addAll(keys);
    retrieve(attrs);
}