public java.lang.String getUrl() {
    java.lang.String baseUrl = null;
    if (Consts.MODULE_PAGE.equals(this.getModule())) {
        baseUrl = io.jpress.model.utils.PageRouter.getRouter(this);
    }else {
        baseUrl = io.jpress.model.utils.ContentRouter.getRouter(this);
    }
    return (com.jfinal.core.JFinal.me().getContextPath()) + baseUrl;
}