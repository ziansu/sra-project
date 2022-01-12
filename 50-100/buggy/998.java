public org.spongepowered.api.command.CommandResult execute(org.spongepowered.api.command.CommandSource src, org.spongepowered.api.command.args.CommandContext args) throws org.spongepowered.api.command.CommandException {
    java.util.Optional<java.lang.String> addingMessage = args.<java.lang.String>getOne(org.spongepowered.api.text.Text.of("message"));
    try {
        int indexNumber = com.gmail.eliterscripts.ConfigManager.addMessage(addingMessage);
        src.sendMessage(org.spongepowered.api.text.Text.of((("Your message was added to the list, indexed under '" + indexNumber) + "'.")));
    } catch (java.lang.NullPointerException e) {
        src.sendMessage(org.spongepowered.api.text.Text.of("Sorry, there was an error adding you message."));
    }
    return null;
}