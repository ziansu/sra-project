private java.lang.String createReadPageTitle(com.pratilipi.data.client.PratilipiData pratilipiData, int pageNo, int pageCount) {
    java.lang.String title = createPratilipiPageTitle(pratilipiData);
    title = (title == null) ? "" : " « " + title;
    java.lang.String pratilipiText = ((com.pratilipi.i18n.I18n.getString("pratilipi", com.pratilipi.filter.UxModeFilter.getDisplayLanguage())) + " / ") + "Pratilipi";
    return (title + " « ") + pratilipiText;
}