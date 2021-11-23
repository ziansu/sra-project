public static void giveFocusBack() {
    if (org.geogebra.web.html5.main.AppW.anyAppHasFocus) {
        return ;
    }
    org.geogebra.web.html5.main.AppW.anyAppHasFocus = true;
    if (org.geogebra.web.html5.main.AppW.nativeGiveFocusBack()) {
        if ((org.geogebra.web.html5.main.AppW.lastActiveElement) != null) {
            org.geogebra.web.html5.main.AppW.lastActiveElement.focus();
        }
    }
}