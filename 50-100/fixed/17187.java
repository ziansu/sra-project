public void post(java.lang.String sRequest) throws java.lang.Exception {
    try {
        if ((m_outputStream) == null) {
            m_outputStream = m_httpUrlConnection.getOutputStream();
        }
        m_outputStream.write(sRequest.getBytes());
        m_outputStream.flush();
    } catch (java.io.IOException e) {
        throw new java.lang.Exception(("WebPost::post->Exception type is " + (e.getClass().toString())));
    }
}