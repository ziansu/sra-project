@java.lang.Override
protected void writeState(final java.io.ObjectOutput out) throws java.io.IOException {
    org.knime.knip.core.io.externalization.BufferedDataOutputStream outStream = new org.knime.knip.core.io.externalization.BufferedDataOutputStream(((java.io.OutputStream) (out)));
    org.knime.knip.core.io.externalization.ExternalizerStreamAccess.getExt().write(outStream, m_obj);
    outStream.flush();
}