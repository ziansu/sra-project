public void addFileHandler(java.lang.String name, java.lang.String path) {
    clickButton("Add");
    getWindowFragment().getEditor().text("name", name);
    getWindowFragment().clickButton("Next");
    getWindowFragment().getEditor().text("path", path);
    getWindowFragment().getEditor().clickButton("Finish");
}