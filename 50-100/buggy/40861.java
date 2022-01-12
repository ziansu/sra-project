@java.lang.Override
public void run() {
    android.widget.TextView levelCount = ((android.widget.TextView) (findViewById(R.id.watch_level_count)));
    android.widget.TextView pointCount = ((android.widget.TextView) (findViewById(R.id.watch_affinity_point)));
    stopAnimation();
    startIdleAnimation();
    levelCount.setText(("" + (com.orbital.thegame.spiffitnesspetsimulator.MainActivity.affinityLevel)));
    pointCount.setText(("" + (com.orbital.thegame.spiffitnesspetsimulator.MainActivity.affinityPoint)));
}