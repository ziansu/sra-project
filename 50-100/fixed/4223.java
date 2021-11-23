@java.lang.Override
protected org.knime.core.data.DataTableSpec[] configure(final org.knime.core.data.DataTableSpec[] inSpecs) throws org.knime.core.node.InvalidSettingsException {
    if ((shpFileLoc.getStringValue()) == null) {
        throw new org.knime.core.node.InvalidSettingsException("No shape file name specified");
    }
    if ((projection.getStringValue()) == null) {
        throw new org.knime.core.node.InvalidSettingsException("You must have a srid number for projection");
    }
    return null;
}