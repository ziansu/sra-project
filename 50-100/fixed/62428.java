private void writeToFile(java.lang.String first, java.lang.String second) {
    java.io.PrintWriter configFile;
    try {
        configFile = new java.io.PrintWriter(winery.config.ConfigWizardFrame.path, "UTF-8");
        configFile.println(first);
        configFile.flush();
        configFile.print(second);
        configFile.flush();
        configFile.close();
    } catch (java.io.FileNotFoundException | java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
}