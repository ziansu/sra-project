private void writeViewHtml(com.psddev.cms.tool.SearchResultItem itemWriter, com.psddev.cms.tool.SearchResultView view) throws java.io.IOException {
    try {
        view.writeHtml(this, page, (itemWriter != null ? itemWriter : new com.psddev.cms.tool.SearchResultItem()));
    } catch (java.lang.IllegalArgumentException | com.psddev.dari.db.Query error) {
        page.writeStart("div", "class", "message message-error");
        page.writeHtml("Invalid advanced query: ");
        page.writeHtml(error.getMessage());
        page.writeEnd();
    }
}