public void close() {
    if ((writer) != null) {
        try {
            writer.flush();
            writer.close();
        } catch (java.lang.Exception e) {
        }
    }
}