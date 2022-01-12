public java.lang.String confirm(com.bionic.edu.entity.Customer customer) {
    if ((customer == null) || ((customer.getId()) == 0)) {
        addMessage("Please Authorize", "Please sign in or create new account.", FacesMessage.SEVERITY_WARN);
        return "authorize";
    }
    return "orderInfo";
}