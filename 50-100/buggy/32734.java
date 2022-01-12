public void addFileHandler(java.lang.String name) {
    clickButton("Add");
    getWindowFragment().getEditor().text("name", name);
    getWindowFragment().clickButton("Next");
    getWindowFragment().getEditor().text("path", "/logs/");
    getWindowFragment().getEditor().clickButton("Finish");
}