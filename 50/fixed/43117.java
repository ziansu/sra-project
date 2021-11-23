@org.junit.Test
public void testCreate() throws java.lang.Exception {
    java.io.File rrdFile = createRrdFile();
    java.lang.String openedFile = m_strategy.openFile(rrdFile.getAbsolutePath());
    m_strategy.closeFile(openedFile);
}