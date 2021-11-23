@java.lang.Override
protected void doStop() throws java.lang.Exception {
    super.doStop();
    synchronized(m_Writer) {
        m_Writer.close();
    }
    m_Writer = null;
    if ((m_Format) != (com.github.fracpete.screencast4j.record.XuggleScreenRecorder.CAPTURE_FORMAT)) {
    }
}