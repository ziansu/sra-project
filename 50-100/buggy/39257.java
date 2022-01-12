@java.lang.Override
public int doEndTag() throws javax.servlet.jsp.JspException {
    java.lang.String content = generateContent();
    if ((variableName) != null) {
        pageContext.setAttribute(variableName, content);
    }else {
        try {
            pageContext.getOut().write(content);
        } catch (java.io.IOException e) {
            throw new javax.servlet.jsp.JspTagException(e);
        }
    }
    return EVAL_PAGE;
}