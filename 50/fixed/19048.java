public java.util.Optional<tech.mcprison.prison.ranks.data.Rank> getRank(tech.mcprison.prison.ranks.data.RankLadder ladder) {
    int id = ranks.get(ladder.name);
    return tech.mcprison.prison.ranks.PrisonRanks.getInstance().getRankManager().getRank(id);
}