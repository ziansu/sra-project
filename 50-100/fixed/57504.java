public static java.lang.CharSequence makeTitle(java.lang.String dateString) {
    java.lang.String[] dateParts = dateString.trim().split("-");
    return ((dateParts[2]) + ". ") + (com.mark.weatherapp.Main.GUI.SetViewValues.DATENAME_MAP.get(dateParts[1]));
}