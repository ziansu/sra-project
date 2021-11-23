public void close() {
    try {
        writer.close();
        for (int i = 0; i < (readers.length); i++) {
            try {
                readers[i].close();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}