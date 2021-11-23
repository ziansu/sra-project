public void save() {
    com.xcrm.common.model.Bookitem bookitem = this.getModel(com.xcrm.common.model.Bookitem.class, "", true);
    bookitem.setUser(getCurrentUserId());
    bookitem.setStatus(false);
    bookitem.setDate(new java.util.Date());
    bookitem.save();
    this.redirect("/cartlist/");
}