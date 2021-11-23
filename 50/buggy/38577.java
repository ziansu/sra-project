@java.lang.Override
public int doEndTag() throws javax.servlet.jsp.JspException {
    com.lab.epam.localization.LocalizationTag.loger.info("doEndTag method");
    return EVAL_PAGE;
}