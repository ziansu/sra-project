@java.lang.Override
public int doStartTag() throws javax.servlet.jsp.JspException {
    javax.servlet.http.HttpSession session = pageContext.getSession();
    java.util.ResourceBundle bundle = ((java.util.ResourceBundle) (session.getAttribute("bundle")));
    try {
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        out.write(new java.lang.String(bundle.getString(key).getBytes("ISO-8859-1"), "cp1251"));
    } catch (java.io.IOException e) {
        throw new javax.servlet.jsp.JspException(e.getMessage());
    }
    com.lab.epam.localization.LocalizationTag.loger.info("doStartTag method");
    return SKIP_BODY;
}