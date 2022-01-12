@java.lang.Override
public void run() {
    android.widget.TextView tv1 = ((android.widget.TextView) (fragment.getView().findViewById(R.id.achievementscreen_accelerometer)));
    tv1.setText((((((("X: " + (acc_1)) + " G, Y: ") + (acc_2)) + " G, Z: ") + (acc_3)) + " G"));
}