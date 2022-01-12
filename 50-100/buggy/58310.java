public void savePage(com.gargoylesoftware.htmlunit.html.HtmlPage page, java.lang.String filepath) throws java.io.IOException {
    org.sakaiproject.util.archiver.PageSaver pageSaver = new org.sakaiproject.util.archiver.PageSaver(getArchiver());
    pageSaver.save(page, filepath);
    getArchiver().msg(((("Saved '" + (page.getTitleText())) + "' in ") + filepath));
}