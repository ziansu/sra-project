@java.lang.Override
protected final void setNext() {
    try {
        final java.lang.String line = this.reader.readLine();
        if (line == null) {
            this.close();
            return ;
        }
        this.setNext(line);
    } catch (java.lang.Exception e) {
        this.close();
        throw new java.lang.RuntimeException(e);
    }
}