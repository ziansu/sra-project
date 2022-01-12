void updateMu(int i, double weight, double[] mu_hat) {
    synchronized(locks[es.valcarcelsainz.dce.DCEAgent.currInd(i)]) {
        double[] mu = mus[es.valcarcelsainz.dce.DCEAgent.currInd(i)];
        double inverse_weight = 1.0 / weight;
        for (int j = 0; j < (mu.length); j++) {
            mu[j] *= inverse_weight;
            mu[j] += mu_hat[j];
            mu[j] *= weight;
        }
    }
}