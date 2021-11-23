public java.util.Optional<tech.mcprison.prison.ranks.data.Rank> getNext(int oldPosition) {
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> rankEntry : ranks.entrySet()) {
        if ((rankEntry.getKey()) > oldPosition) {
            return tech.mcprison.prison.ranks.PrisonRanks.getInstance().getRankManager().getRank(rankEntry.getValue());
        }
    }
    return java.util.Optional.empty();
}