private void randomCountReset() {
    java.util.Random random = new java.util.Random();
    fCount = (MIN_COUNT) + ((java.lang.Math.abs(random.nextInt())) % ((MAX_COUNT) - (MIN_COUNT)));
    fChangedValues.clear();
    for (java.lang.Object listener : fListeners.getListeners()) {
        ((org.eclipse.cdt.examples.dsf.dataviewer.Listener) (listener)).countChanged();
    }
}