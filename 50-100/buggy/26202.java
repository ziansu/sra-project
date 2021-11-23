public void addPeriodicSizeHandler(java.lang.String name, java.lang.String suffix) {
    clickButton("Add");
    getWindowFragment().getEditor().text("name", name);
    getWindowFragment().getEditor().text("suffix", suffix);
    getWindowFragment().clickButton("Next");
    getWindowFragment().getEditor().text("path", "/logs/");
    getWindowFragment().getEditor().clickButton("Finish");
}