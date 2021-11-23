public static javax.el.ValueExpression createValueExpression(final java.lang.String expression) {
    final javax.faces.context.FacesContext facesContext = org.jbromo.webapp.jsf.cdi.CDIFacesUtil.getFacesContext();
    final javax.faces.application.Application app = facesContext.getApplication();
    final javax.el.ExpressionFactory elFactory = app.getExpressionFactory();
    final javax.el.ELContext elContext = facesContext.getELContext();
    return elFactory.createValueExpression(elContext, expression, java.lang.Object.class);
}