public void addPeriodicSizeHandler(java.lang.String name, java.lang.String suffix, java.lang.String path) {
    clickButton("Add");
    getWindowFragment().getEditor().text("name", name);
    getWindowFragment().getEditor().text("suffix", suffix);
    getWindowFragment().clickButton("Next");
    getWindowFragment().getEditor().text("path", path);
    getWindowFragment().getEditor().clickButton("Finish");
}