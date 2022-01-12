@java.lang.Override
public java.lang.Object getParamValue() {
    org.restlet.representation.Representation entity = this.tlContext.get().getRequest().getEntity();
    if ((entity != null) && (entity.isAvailable())) {
        org.restlet.ext.jaxrs.internal.wrappers.params.ParameterList.FormParamGetter.form = new org.restlet.data.Form(entity);
    }
    final java.lang.String paramName = this.formParam.value();
    try {
        return super.getParamValue(org.restlet.ext.jaxrs.internal.wrappers.params.ParameterList.FormParamGetter.form, paramName);
    } catch (org.restlet.ext.jaxrs.internal.exceptions.ConvertParameterException e) {
        throw new org.restlet.ext.jaxrs.internal.exceptions.ConvertQueryParamException(e);
    }
}