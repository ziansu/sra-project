@com.planed.ctlBot.discord.DiscordCommand(name = { "lineupwmentions" }, help = "lists named lineup with mentions - {lineupwmentions, lineupUniqueId}", roleRequired = com.planed.ctlBot.common.AccessLevel.Admin)
public void listLineupWithoutMentionCommand(final com.planed.ctlBot.commands.data.CommandCall call) {
    com.planed.ctlBot.domain.Lineup lineup = lineupRepository.findByLineupId(call.getParameters().get(0));
    discordService.replyInChannel(call.getChannel(), (((((lineup.getLineupId()) + " ") + (lineup.getPlayerMentions())) + " ") + (lineup.getMessage())));
}