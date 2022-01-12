protected de.dreier.mytargets.shared.models.Passe randomPasse(de.dreier.mytargets.shared.models.Round round, int arrowsPerEnd, java.util.Random gen) {
    de.dreier.mytargets.shared.models.Passe p = new de.dreier.mytargets.shared.models.Passe(arrowsPerEnd);
    p.roundId = round.getId();
    for (int i = 0; i < arrowsPerEnd; i++) {
        p.shot[i].index = i;
        p.shot[i].zone = gen.nextInt(5);
    }
    return p;
}