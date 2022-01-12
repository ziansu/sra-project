public java.util.Iterator<java.lang.String> call(java.lang.String s) throws java.lang.Exception {
    java.lang.String line = com.iyonger.spark.example.NewJavaWordCount.replaceNonLetter(s).trim();
    if (line.isEmpty()) {
        return new java.util.ArrayList<java.lang.String>().iterator();
    }
    com.iyonger.spark.example.NewJavaWordCount.logger.info(("line after replacement:" + (line.trim())));
    return java.util.Arrays.asList(com.iyonger.spark.example.NewJavaWordCount.SPACE.split(line.trim())).iterator();
}