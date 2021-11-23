public void onRowEditUser(org.primefaces.event.RowEditEvent event) {
    ir.azarshab.model.User user = ((ir.azarshab.model.User) (event.getObject()));
    ejbFacade.edit(user);
    users.remove(user);
    users.add(user);
    javax.faces.application.FacesMessage msg = new javax.faces.application.FacesMessage("ویرایش", "اطلاعات با موفقیت ویرایش شد.");
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, msg);
}