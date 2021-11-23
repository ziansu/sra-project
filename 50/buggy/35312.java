@java.lang.Override
public void init(javax.servlet.FilterConfig filterConfig) throws javax.servlet.ServletException {
    gov.hhs.fha.nhinc.admingui.servlet.SanitizationFilter.LOG.debug("init my own filter");
    this.filterConfig = filterConfig;
}