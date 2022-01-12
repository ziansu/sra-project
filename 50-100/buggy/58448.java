public void createMainBook() throws java.lang.Exception {
    uk.me.richardcook.sessionography.model.BookFile file = new uk.me.richardcook.sessionography.model.BookFile("book.tex", getBookStrings());
    file.setUpDocument(null, false);
    bookSectionService.writeAll(file);
    file.endDocument();
    file.closeFile();
}