public java.lang.String addPet() {
    com.konstpan.jee.vetcalendar.entity.Customer cust = customerService.findCustomerById(customer.getId());
    cust.getPets().add(pet);
    customerService.update(cust);
    pet = null;
    javax.faces.application.FacesMessage facesMsg = new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, bundle.getString("createdPetMessage"), null);
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    return "index";
}