private java.lang.String displayCSVOutput() {
    java.lang.String path = utilityBean.getSelectedOutput().getPath();
    try {
        java.lang.String contents = utils.FileReader.readFile(path, 10);
        return contents;
    } catch (java.io.FileNotFoundException e) {
        return "File not found";
    }
}