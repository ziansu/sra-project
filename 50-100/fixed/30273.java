public java.util.List<com.savelives.entityclasses.SearchQuery> getItems() {
    java.util.Map<java.lang.String, java.lang.Object> map = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    java.lang.String userPrimaryKey = ((java.lang.String) (map.get("user_id")));
    com.savelives.entityclasses.User u = getUserFacade().findById(userPrimaryKey);
    java.lang.System.out.println(u.toDocument());
    this.items = u.getHistorySearch();
    return items;
}