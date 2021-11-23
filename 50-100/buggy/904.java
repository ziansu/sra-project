private static void writeDataSetAsXtab(org.dbunit.dataset.IDataSet dataSet, java.nio.file.Path targetPath) throws java.lang.Exception {
    java.nio.charset.Charset encoding = com.google.common.base.Charsets.UTF_8;
    java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(targetPath, encoding);
    writer.write((("<?xml version='1.0' encoding='" + (encoding.name())) + "\'?>\n"));
    org.dbunit.dataset.xml.XmlDataSetWriter xmlWriter = new org.dbunit.dataset.xml.XmlDataSetWriter(writer);
    xmlWriter.write(dataSet);
}