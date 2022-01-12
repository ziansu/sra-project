void updateMu(int i, double weight, double[] mu_hat) {
    synchronized(locks[es.valcarcelsainz.dce.DCEAgent.currInd(i)]) {
        double[] mu = mus[es.valcarcelsainz.dce.DCEAgent.currInd(i)];
        for (int j = 0; j < (mu.length); j++) {
            mu[j] += weight * (mu_hat[j]);
        }
    }
}