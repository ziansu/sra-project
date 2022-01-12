@java.lang.Override
protected java.lang.Void call() throws java.lang.Exception {
    java.io.OutputStream os = null;
    try {
        os = new java.io.FileOutputStream(output);
        while ((!(buffer.isEmpty())) || (dataExist.get())) {
            checkPaused();
            os.write(buffer.take());
            current.getAndDecrement();
        } 
    } finally {
        if (os != null) {
            os.flush();
            os.close();
        }
    }
    return null;
}