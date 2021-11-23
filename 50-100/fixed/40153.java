private java.util.List<java.lang.String> fillPageListForAdministrators() {
    java.util.ArrayList<java.lang.String> listForAdministrators = new java.util.ArrayList<java.lang.String>();
    listForAdministrators.add(de.ofCourse.system.AccessPhaseListener.URL_ADMIN_MANAGEMENT);
    listForAdministrators.add(de.ofCourse.system.AccessPhaseListener.URL_SEARCH_USER);
    listForAdministrators.add(de.ofCourse.system.AccessPhaseListener.URL_CREATE_USER);
    listForAdministrators.add(de.ofCourse.system.AccessPhaseListener.URL_CREATE_COURSE);
    return listForAdministrators;
}