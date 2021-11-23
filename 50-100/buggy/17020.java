static java.lang.String getDisplaySettings(java.lang.String display_name) {
    if (com.kerbybit.chattriggers.objects.DisplayHandler.display_settings.containsKey(display_name)) {
        java.lang.StringBuilder return_string = new java.lang.StringBuilder();
        for (java.lang.String value : com.kerbybit.chattriggers.objects.DisplayHandler.display_settings.get(display_name).split(",")) {
            return_string.append("<").append(value).append(">");
        }
        return return_string.toString();
    }else {
        return "";
    }
}