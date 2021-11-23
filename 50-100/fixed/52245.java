@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.lang.String save(com.oprisklib.common.model.WXReceiveXmlModel wxXML) throws java.lang.Exception {
    com.oprisklib.jpa.model.OpriskBookStoreDTO bookStore = null;
    java.lang.String isbn = wxXML.getScanResult().substring(((wxXML.getScanResult().indexOf(",")) + 1));
    log.info(("isbn:" + isbn));
    org.json.JSONObject json = doubanService.getBookInfoByIsbn(isbn);
    bookStore = parseJsonToBookStore(json, "oprisk");
    this.opriskRepositoryPoint.getOpriskBookStoreRep().save(bookStore);
    return bookStore.getTitle();
}