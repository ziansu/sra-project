public void write(java.io.File outputFile) throws java.io.FileNotFoundException, java.io.IOException {
    java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(outputFile));
    if ((prependText) != null)
        writer.write(((prependText) + "\n"));
    
    if ((contents) == null)
        contents = readFile();
    
    writer.write(contents);
    if ((appendText) != null)
        writer.write(("\n" + (appendText)));
    
    writer.close();
}