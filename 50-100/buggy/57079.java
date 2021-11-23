public java.lang.String getSelectedFileAbsPath() {
    java.lang.String absPath = "";
    if ((m_selectedTarget) == null) {
        return absPath;
    }
    try {
        if (m_selectedTarget.isFile()) {
            absPath = m_selectedTarget.getCanonicalPath();
            absPath = util.FSUtil.toSeparatorEnded(absPath);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return absPath;
}