@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> parseArguments(final java.util.List<java.lang.String> arguments) throws name.richardson.james.bukkit.util.command.CommandArgumentException {
    java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    if (arguments.isEmpty()) {
        map.put("delay", TimedMessages.START_DELAY);
    }else {
        try {
            map.put("delay", java.lang.Integer.parseInt(arguments.get(0)));
        } catch (java.lang.NumberFormatException exception) {
            throw new name.richardson.james.bukkit.util.command.CommandArgumentException("You must specify a valid number!", "The time should be in seconds.");
        }
    }
    return map;
}