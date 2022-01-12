@java.lang.Override
public void onClick(android.view.View v) {
    localizationMonitoring.reset();
    localizationView.setParticles(localizationMonitoring.getParticles());
    localizationView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            localizationView.invalidate();
        }
    });
}