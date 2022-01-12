@java.lang.Override
public long getCommandCooldownMs(java.lang.String label) {
    java.util.Map.Entry<java.util.regex.Pattern, java.lang.Long> result = getCommandCooldownEntry(label);
    return result != null ? result.getValue() : -1;
}