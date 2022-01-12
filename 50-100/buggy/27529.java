private void checkAndCommit() {
    if (!(enabled)) {
        act.app.conf.AppConfigurator.logger.info("Global CSRF is disabled");
        conf.enableCsrf(false);
        return ;
    }
    act.app.conf.AppConfigurator.logger.info("Global CSRF is enabled");
    conf.csrfCookieName(this.cookieName);
    conf.csrfHeaderName(this.headerName);
    conf.csrfParamName(this.paramName);
    conf.csrfProtector(this.protector);
}