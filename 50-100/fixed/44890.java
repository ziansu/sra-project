@java.lang.Override
protected void reset() {
    if (org.knime.MyWFS.MyWFSNodeModel.m_blconnect) {
        if (((m_selStr.getStringValue()) == null) || ((m_selStr.getStringValue()) == "")) {
            org.knime.MyWFS.MyWFSNodeModel.m_blconnect = false;
        }
    }else {
        org.knime.MyWFS.MyWFSNodeModel.m_blconnect = true;
    }
}