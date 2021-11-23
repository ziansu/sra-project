public int doEndTag() throws javax.servlet.jsp.JspException {
    try {
        java.lang.String bodyContentString = (null != (getBodyContent())) ? getBodyContent().getString() : "";
        bodyContent = null;
        pageContext.getOut().write(bodyContentString);
    } catch (java.io.IOException e) {
        throw new javax.servlet.jsp.JspException(e);
    } catch (java.lang.RuntimeException e) {
        throw new javax.servlet.jsp.JspException(e);
    }
    return EVAL_PAGE;
}