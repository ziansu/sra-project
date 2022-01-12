@java.lang.Override
public org.apache.struts.action.ActionForward execute(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    com.team404.Customer cForm = ((com.team404.Customer) (form));
    com.team404.RegisterDAO DAO = new com.team404.RegisterDAO();
    if ((DAO.isCustEmailAval(cForm)) == true) {
        DAO.newCustomer(cForm);
        return mapping.findForward("success");
    }
    return mapping.findForward("failure");
}