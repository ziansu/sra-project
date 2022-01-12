public void flushWriter() {
    output.println(message);
    output.flush();
    message = new java.lang.StringBuilder();
}