@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    super.finalize();
    edu.mit.ll.graphulo.skvi.RemoteWriteIterator.log.info(("finalize() RemoteWriteIterator " + (tableName)));
    if ((writerAll) != null)
        writerAll.close();
    else {
        if ((writer) != null)
            writer.close();
        
        if ((writerTranspose) != null)
            writerTranspose.close();
        
    }
}