@java.lang.Override
public void run() {
    android.widget.TextView tv1 = ((android.widget.TextView) (fragment.getView().findViewById(R.id.achievementscreen_pressure)));
    tv1.setText((((("Druck: " + (pressure_1)) + " mBar, ") + (pressure_2)) + " m"));
}