public void back() throws java.io.IOException {
    (iter)++;
    fr.trendev.bean.MyBeanJSF.logger.log(java.util.logging.Level.INFO, "BACK LINK ");
    javax.faces.context.ExternalContext ec = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext();
    ec.redirect(ec.getRequestContextPath());
}