public java.lang.String addPet() {
    customer = customerService.findCustomerById(customer.getId());
    customer.getPets().add(pet);
    customerService.update(customer);
    customer = null;
    pet = null;
    javax.faces.application.FacesMessage facesMsg = new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, bundle.getString("createdPetMessage"), null);
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    return "index";
}