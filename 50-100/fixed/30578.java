private void initializeCommandLineSuitesParams() {
    if (null == (m_cmdlineSuites)) {
        return ;
    }
    for (org.testng.xml.XmlSuite s : m_cmdlineSuites) {
        if ((m_threadCount) != (-1)) {
            s.setThreadCount(m_threadCount);
        }
        s.setParallel(m_parallelMode);
        if ((m_configFailurePolicy) != null) {
            s.setConfigFailurePolicy(m_configFailurePolicy.toString());
        }
    }
}