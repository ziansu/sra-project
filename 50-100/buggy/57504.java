public static java.lang.CharSequence makeTitle(java.lang.String dateString) {
    java.lang.String[] dateParts = dateString.trim().split("-");
    java.lang.CharSequence dateStringOut = ((dateParts[2]) + ". ") + (com.mark.weatherapp.Main.GUI.SetViewValues.DATENAME_MAP.get(dateParts[1]));
    return dateStringOut;
}