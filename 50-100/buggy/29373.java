public void close() throws java.io.IOException {
    if (closed) {
        daaa.qdscraper.services.Console.printErr((("File " + (path)) + " already closed"));
        return ;
    }
    if (open) {
        out.write(((daaa.qdscraper.utils.QDUtils.makeTagclosed(daaa.qdscraper.model.GamelistXML.GAMELIST_ROOT_TAGNAME)) + "\n"));
    }
    out.flush();
    out.close();
    closed = true;
}