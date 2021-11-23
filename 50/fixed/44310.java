public void configureColumns() {
    org.primefaces.context.RequestContext context = org.primefaces.context.RequestContext.getCurrentInstance();
    context.addCallbackParam("success", true);
}