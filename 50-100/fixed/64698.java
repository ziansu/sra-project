public java.lang.String write(java.lang.String line) throws java.io.IOException {
    java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(new java.io.File(this._fileName), true));
    writer.write(line);
    writer.newLine();
    writer.close();
    return line;
}