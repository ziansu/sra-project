private java.lang.String getSupporterSettings() {
    java.lang.StringBuilder settings = new java.lang.StringBuilder();
    settings.append(" -quality ");
    settings.append(vncOptionQualitySliderValue.get());
    return settings.toString();
}