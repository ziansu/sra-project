@java.lang.Override
public void adjustPBest() {
    for (int i = 0; i < (probs.length); i++) {
        double k = pBest_sample.getTable().get(probs[i].getNode());
        probs[i].bias(k, epsilon);
    }
}