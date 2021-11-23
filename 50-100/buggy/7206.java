public java.io.BufferedWriter getWriter() throws java.io.IOException {
    if ((this.lines) >= (org.crossref.eventdata.twitter.RotatingFileWriter.MAX_LINES)) {
        this.rotateCallback.invoke(this.file);
        this.writer.close();
        this.lines = 0;
        this.file = this.newFile();
        this.writer = new java.io.BufferedWriter(new java.io.FileWriter(this.file));
    }
    (this.lines)++;
    return this.writer;
}