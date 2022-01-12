public org.apache.struts.action.ActionErrors validate(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request) {
    org.apache.struts.action.ActionErrors errors = new org.apache.struts.action.ActionErrors();
    if ((((getPhoneNumber()) == null) || (((getPhoneNumber().length()) < 2) && ((getPhoneKind()) == null))) || ((getPhoneKind().length()) < 1)) {
        errors.add("phonenumber ", new org.apache.struts.action.ActionMessage("phonenumber.delete.error"));
    }
    return errors;
}