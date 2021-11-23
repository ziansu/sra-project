public int getLosses() {
    int losses = 0;
    for (int i = 0; i < (_matchHistory.size()); ++i) {
        if ((_matchHistory.get(i).getVicId()) != (_id)) {
            losses++;
        }
    }
    return losses;
}