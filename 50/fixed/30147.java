@java.lang.Override
public void visit(org.opencompare.api.java.PCM pcm) {
    listeFeatures = new java.util.HashMap<>();
    for (org.opencompare.api.java.Feature feature : pcm.getConcreteFeatures()) {
        feature.accept(this);
    }
}