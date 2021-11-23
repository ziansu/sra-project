public void close() {
    writeBand();
    if ((writer) != null) {
        try {
            writer.flush();
            writer.close();
        } catch (java.lang.Exception e) {
        }
    }
}