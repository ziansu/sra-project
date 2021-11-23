@java.lang.Override
public void run() {
    try {
        if (m_hasVersion2FormatChunks) {
            readChunksV2();
        }else {
            readChunks();
        }
    } finally {
        synchronized(this) {
            m_hasMoreChunks = false;
            this.notifyAll();
            try {
                m_saveFile.close();
            } catch (java.io.IOException e) {
            }
        }
    }
}