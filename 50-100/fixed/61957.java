public void all() {
    int kindId = getParaToInt(0);
    int pageNumber = getParaToInt("page", 1);
    int pageSize = getParaToInt("pagesize", 10);
    setAttr("kindid", kindId);
    setAttr("page", Dictionary.dao.paginate(pageNumber, pageSize, "select *", " from dictionary where kind=?", DictionaryKind.dao.findById(kindId).get("kind")));
    render("all.html");
}