public com.jagrosh.jdautilities.commandclient.Command build(java.util.function.BiConsumer<com.jagrosh.jdautilities.commandclient.Command, com.jagrosh.jdautilities.commandclient.CommandEvent> execution) {
    return new com.jagrosh.jdautilities.commandclient.CommandBuilder.BlankCommand(name, help, category, arguments, guildOnly, requiredRole, ownerCommand, cooldown, userPermissions, botPermissions, ((java.lang.String[]) (aliases.toArray())), ((com.jagrosh.jdautilities.commandclient.Command[]) (children.toArray())), helpBiConsumer, usesTopicTags, cooldownScope) {
        @java.lang.Override
        protected void execute(com.jagrosh.jdautilities.commandclient.CommandEvent event) {
            execution.accept(this, event);
        }
    };
}