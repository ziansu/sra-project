public static void fileExtension() {
    java.lang.String[] resourceFileArray = new java.lang.String[]{ "pdf" , "doc" , "docx" , "xsl" , "xslx" , "png" , "jpeg" , "gif" };
    for (java.lang.String ext : resourceFileArray) {
        com.pcwrek.seck.Crawler.fileExt.add(ext);
    }
}