public java.lang.String save() {
    facade.create(current);
    web.FacesUtil.addInfoMessage("Book successfully saved");
    return "findBooks.xhtml";
}