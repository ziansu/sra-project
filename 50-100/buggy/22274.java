public void retrieve(java.io.File f) throws java.io.IOException, java.lang.InterruptedException {
    org.dcm4che3.data.Attributes attrs = new org.dcm4che3.data.Attributes();
    org.dcm4che3.io.DicomInputStream dis = null;
    try {
        attrs.addSelected(new org.dcm4che3.io.DicomInputStream(f).readDataset((-1), (-1)), inFilter);
    } finally {
        org.dcm4che3.util.SafeClose.close(dis);
    }
    attrs.addAll(keys);
    retrieve(attrs);
}