public void initAudio() {
    setupVisualizerFxAndUI();
    try {
        visualizer.setEnabled(true);
    } catch (java.lang.Exception ex) {
        android.util.Log.e("except", (" f" + (ex.getMessage())));
    }
}