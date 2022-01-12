public com.jagrosh.jdautilities.commandclient.Command build(java.util.function.BiConsumer<com.jagrosh.jdautilities.commandclient.Command, com.jagrosh.jdautilities.commandclient.CommandEvent> execution) {
    return new com.jagrosh.jdautilities.commandclient.CommandBuilder.BlankCommand(name, help, category, arguments, guildOnly, requiredRole, ownerCommand, cooldown, userPermissions, botPermissions, aliases.toArray(new java.lang.String[aliases.size()]), children.toArray(new com.jagrosh.jdautilities.commandclient.Command[children.size()]), helpBiConsumer, usesTopicTags, cooldownScope) {
        @java.lang.Override
        protected void execute(com.jagrosh.jdautilities.commandclient.CommandEvent event) {
            execution.accept(this, event);
        }
    };
}