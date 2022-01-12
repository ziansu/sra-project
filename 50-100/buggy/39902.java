@java.lang.Override
public java.lang.String translateTags(java.lang.String input) {
    if ((pluginPrefix) != null) {
        input = input.replaceAll("%prefix%", pluginPrefix);
    }
    if ((messageSeparator) != null) {
        input = input.replaceAll("%separator%", messageSeparator);
    }
    if ((header) != null) {
        input = input.replaceAll("%header%", header);
    }
    return input;
}