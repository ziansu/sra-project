public void promote(com.github.arsenalfcgunners.gappleperms.Rank r) {
    rank = r;
    if ((rank.isDonor()) && (!(donorranks.contains(rank)))) {
        donorranks.add(rank);
    }
    gp.getRankManager().setDonorRanks(uuid, donorranks);
    gp.getRankManager().setRank(uuid, rank);
    clearPerms();
    givePerms();
}