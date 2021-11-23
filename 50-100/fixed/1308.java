@java.lang.Override
public java.lang.String getActionURL(javax.faces.context.FacesContext context, java.lang.String viewId) {
    java.lang.String url = (form.isUseRequestURI()) ? getActionURL(context) : super.getActionURL(context, viewId);
    java.lang.String queryString = org.omnifaces.util.Servlets.toQueryString(form.collectParams(context));
    return org.omnifaces.util.Utils.isEmpty(queryString) ? url : (url + (url.contains("?") ? "&" : "?")) + queryString;
}