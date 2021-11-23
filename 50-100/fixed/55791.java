@java.lang.Override
public byte[] load(java.lang.String href) throws java.lang.Exception {
    java.io.InputStream in = null;
    java.io.ByteArrayOutputStream out = null;
    try {
        in = org.roda.core.RodaCoreFactory.getConfigurationFileAsStream(((org.roda.core.data.common.RodaConstants.CROSSWALKS_DISSEMINATION_OTHER_PATH) + href));
        out = new java.io.ByteArrayOutputStream();
        org.apache.commons.compress.utils.IOUtils.copy(in, out);
        return out.toByteArray();
    } finally {
        org.apache.commons.compress.utils.IOUtils.closeQuietly(in);
        org.apache.commons.compress.utils.IOUtils.closeQuietly(out);
    }
}