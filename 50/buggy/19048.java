public java.util.Optional<tech.mcprison.prison.ranks.data.Rank> getRank(tech.mcprison.prison.ranks.data.RankLadder ladder) {
    return tech.mcprison.prison.ranks.PrisonRanks.getInstance().getRankManager().getRank(ranks.get(ladder.name));
}