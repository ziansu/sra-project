public java.lang.String getSelectedFileAbsPath() {
    java.lang.String absPath = "";
    if ((m_selectedTarget) == null) {
        return absPath;
    }
    try {
        if (m_selectedTarget.isFile()) {
            absPath = m_selectedTarget.getCanonicalPath();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return absPath;
}