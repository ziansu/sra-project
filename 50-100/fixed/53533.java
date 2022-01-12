public void promoteOfflinePlayer(java.util.UUID uuid, com.github.arsenalfcgunners.gappleperms.Rank rank) {
    java.util.ArrayList<com.github.arsenalfcgunners.gappleperms.Rank> donorranks = getDonorRanks(uuid);
    if ((rank.isDonor()) && (!(donorranks.contains(rank)))) {
        donorranks.add(rank);
    }
    setRank(uuid, rank);
    setDonorRanks(uuid, donorranks);
}