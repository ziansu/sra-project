@java.lang.Override
public void run() {
    try {
        com.core.util.LuceneUtil.indexWriter.close();
        com.core.util.LuceneUtil.indexReader.close();
    } catch (java.lang.Exception e) {
        new java.lang.RuntimeException(e);
    }
}