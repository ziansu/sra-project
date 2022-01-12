private es.dicarea.postman.whereisthepostman.StatusCorreosEnum findStatus(org.jsoup.nodes.Document doc) {
    org.jsoup.select.Elements elements = doc.select("span.txtNormal");
    if ((elements != null) && ((elements.size()) > 0)) {
        java.lang.String statusStr = elements.get(((elements.size()) - 1)).text().trim();
        return es.dicarea.postman.whereisthepostman.StatusCorreosEnum.getStatus(statusStr);
    }
    return StatusCorreosEnum.NO_DEFINIDO;
}