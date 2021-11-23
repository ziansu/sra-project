private java.lang.String showDocument(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res, imcode.server.ImcmsServices imcref, java.lang.String lang, imcode.server.user.UserDomainObject user) throws java.io.IOException {
    java.lang.String meta_id = req.getParameter("templates_doc");
    java.lang.String htmlStr = null;
    if (meta_id != null) {
        res.sendRedirect(("AdminDoc?meta_id=" + meta_id));
    }else {
        htmlStr = createDocumentsUsingTemplateDialog(imcref, user, null, lang);
    }
    return htmlStr;
}