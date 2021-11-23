@java.lang.Override
protected org.springframework.web.servlet.view.freemarker.FreeMarkerConfig autodetectConfiguration() throws org.springframework.beans.BeansException {
    return org.craftercms.engine.service.context.SiteContext.getCurrent().getFreeMarkerConfig();
}