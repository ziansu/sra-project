public boolean matchDead() throws java.io.IOException {
    java.util.Set<typo.gtp.Move> deadGTP = mGTP.getDeadList();
    java.util.Set<typo.gtp.Move> deadRest = mRest.getDeadList();
    if ((deadRest.size()) == (deadGTP.size())) {
        for (typo.gtp.Move m : deadRest) {
            if (!(deadGTP.contains(m))) {
                return false;
            }
        }
    }
    return true;
}