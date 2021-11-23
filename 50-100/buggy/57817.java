protected void map(com.bigdata.Text key, com.bigdata.DoubleWritable value, com.bigdata.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] wordPageId = key.toString().split(com.bigdata.BuildVector.SEPARATOR);
    pageId.set(java.lang.Long.parseLong(wordPageId[1]));
    pageIds.add(java.lang.Long.parseLong(wordPageId[1]));
    wordTFIDF.set((((wordPageId[0]) + (com.bigdata.BuildVector.SEPARATOR)) + (value.toString())));
    context.write(pageId, wordTFIDF);
}