public void changeLocale() {
    javax.servlet.http.HttpServletRequest request = ((javax.servlet.http.HttpServletRequest) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRequest()));
    java.lang.String locale = request.getParameter("lang");
    this.currentLocate = new java.util.Locale(locale);
    com.weblibrary.controllers.SearchController.fillSearchListByLocale(this.currentLocate);
}