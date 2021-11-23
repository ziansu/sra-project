public void modify() {
    int id = getParaToInt(0);
    com.linpeng.advisor.model.DictionaryKind dictionaryKind = DictionaryKind.dao.findById(id);
    setAttr("dictionarykind", dictionaryKind);
    render("create.html");
}