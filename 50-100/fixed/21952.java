private void randomCountReset() {
    java.util.Random random = new java.util.Random();
    fCount = (MIN_COUNT) + (random.nextInt(((MAX_COUNT) - (MIN_COUNT))));
    fChangedValues.clear();
    for (org.eclipse.cdt.examples.dsf.dataviewer.Listener listener : fListeners) {
        listener.countChanged();
    }
}