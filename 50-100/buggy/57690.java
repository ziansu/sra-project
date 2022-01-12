@java.lang.Override
public com.earth2me.essentials.Entry<java.util.regex.Pattern, java.lang.Long> getCommandCooldownEntry(java.lang.String label) {
    if (isCommandCooldownsEnabled()) {
        for (com.earth2me.essentials.Entry<java.util.regex.Pattern, java.lang.Long> entry : this.commandCooldowns.entrySet()) {
            if (entry.getKey().matcher(label).matches()) {
                return entry;
            }
        }
    }
    return null;
}