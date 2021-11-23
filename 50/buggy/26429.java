private java.lang.String getSupporterSettings() {
    java.lang.StringBuilder settings = new java.lang.StringBuilder();
    settings.append(" -quality ");
    settings.append(vncOptionQualitySliderValue.toString());
    return settings.toString();
}