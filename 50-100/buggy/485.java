@java.lang.Override
public void adjustPBest() {
    java.lang.System.out.println("________________________ s");
    java.lang.System.out.println("Adjusting using sample: ");
    pBest_sample.print();
    print();
    for (int i = 0; i < (probs.length); i++) {
        double k = pBest_sample.getTable().get(probs[i].getNode());
        probs[i].bias(k, epsilon);
    }
    print();
    java.lang.System.out.println("________________________ f");
}