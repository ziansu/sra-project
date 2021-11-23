@java.lang.Override
public void onCommand(net.dv8tion.jda.core.entities.User sender, stream.flarebot.flarebot.objects.GuildWrapper guild, net.dv8tion.jda.core.entities.TextChannel channel, net.dv8tion.jda.core.entities.Message message, java.lang.String[] args, net.dv8tion.jda.core.entities.Member member) {
    if (getPermissions(channel).isCreator(sender)) {
        channel.sendFile(new java.io.File("latest.log"), new net.dv8tion.jda.core.MessageBuilder().append('\u200b').build()).queue();
    }
}