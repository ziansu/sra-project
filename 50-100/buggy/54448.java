private void indexFileContent(java.io.BufferedReader bufferedReader, org.apache.lucene.index.IndexWriter indexWriter) throws java.io.IOException {
    java.lang.String line = bufferedReader.readLine();
    int recordIndex = 0;
    while (line != null) {
        if (isTermSizeValid(line)) {
            docInteraction.addDoc(indexWriter, java.lang.Integer.toString(recordIndex), line);
            recordIndex++;
            line = bufferedReader.readLine();
        }
    } 
}