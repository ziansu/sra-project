@java.lang.Override
public java.lang.String translateTags(java.lang.String input) {
    if ((pluginPrefix) != null) {
        input = input.replace("%prefix%", pluginPrefix);
    }
    if ((messageSeparator) != null) {
        input = input.replace("%separator%", messageSeparator);
    }
    if ((header) != null) {
        input = input.replace("%header%", header);
    }
    return input;
}