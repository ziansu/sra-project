public static void setStaticTheme(java.lang.String s) {
    javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
    sdmxsaxfaces.beans.GuestPreferences bean = ((sdmxsaxfaces.beans.GuestPreferences) (context.getExternalContext().getSessionMap().get("guestPreferences")));
    if (bean != null) {
        bean.setTheme(s);
    }
}