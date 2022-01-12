@java.lang.Override
public void run() {
    android.widget.TextView tv1 = ((android.widget.TextView) (fragment.getView().findViewById(R.id.achievementscreen_IR_temperature)));
    tv1.setText((("IR Temperatur: " + (iR_Temperature)) + " \u00b0C"));
    android.widget.TextView tv2 = ((android.widget.TextView) (fragment.getView().findViewById(R.id.achievementscreen_temperature)));
    tv2.setText((("IR Temperatur: " + (temperatur)) + " \u00b0C"));
}