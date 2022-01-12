protected java.lang.String getAsBroadcast(io.minimum.minecraft.superbvote.votes.Vote vote) {
    org.bukkit.entity.Player onlineVoted = org.bukkit.Bukkit.getPlayerExact(vote.getName());
    java.lang.String replaced = message;
    for (io.minimum.minecraft.superbvote.configuration.message.placeholder.PlaceholderProvider provider : io.minimum.minecraft.superbvote.configuration.message.PlainStringMessage.PROVIDER_LIST) {
        if (provider.canUse()) {
            replaced = provider.applyForBroadcast(onlineVoted, replaced, vote);
        }
    }
    return replaced;
}