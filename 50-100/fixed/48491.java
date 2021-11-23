public void add() {
    if (name.isEmpty()) {
        javax.faces.application.FacesMessage fm = new javax.faces.application.FacesMessage("Name can't be empty");
        context.addMessage(fm.getSummary(), fm);
        refresh();
        return ;
    }
    org.jboss.as.quickstarts.cdi.service.Item item = new org.jboss.as.quickstarts.cdi.service.Item();
    item.setName(name);
    itemService.create(item);
    name = org.jboss.as.quickstarts.cdi.service.ItemBean.EMPTY_STRING;
    refresh();
}