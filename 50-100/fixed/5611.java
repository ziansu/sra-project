@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    bg = new com.voicesprint.variable_j.voicesprint.Background(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.full_background));
    player = new com.voicesprint.variable_j.voicesprint.Player(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.superman), 0, 0);
    bg.setVector((-5));
    thread.setRunning(true);
    thread.start();
    pitchDetector = new com.voicesprint.variable_j.voicesprint.PitchDetector(this);
    pitchDetector.setRunning(true);
}