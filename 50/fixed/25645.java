public net.dv8tion.jda.core.entities.TextChannel getGreetingChannel() {
    return getAsGuild().getTextChannelById(Setting.GREET.get(this));
}