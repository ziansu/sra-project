@java.lang.Override
public java.util.Map.Entry<java.util.regex.Pattern, java.lang.Long> getCommandCooldownEntry(java.lang.String label) {
    if (isCommandCooldownsEnabled()) {
        for (java.util.Map.Entry<java.util.regex.Pattern, java.lang.Long> entry : this.commandCooldowns.entrySet()) {
            if (entry.getKey().matcher(label).matches()) {
                return entry;
            }
        }
    }
    return null;
}