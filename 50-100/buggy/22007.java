private boolean validateEmail(java.lang.String email) {
    if (org.apache.commons.lang.StringUtils.isEmpty(email)) {
        org.jboss.seam.faces.FacesMessages.instance().addToControl("email", "#{msgs['javax.faces.component.UIInput.REQUIRED']}");
        return false;
    }
    org.zanata.model.HPerson person = personDAO.findByEmail(email);
    if ((person != null) && (!(person.getAccount().equals(account)))) {
        org.jboss.seam.faces.FacesMessages.instance().addToControl("email", "This email address is already taken");
        return false;
    }
    return true;
}