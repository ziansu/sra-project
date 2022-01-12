public void print(android.widget.TextView view) {
    java.lang.String s = (((("YAW: " + (java.lang.Double.toString(yaw))) + " PITCH: ") + (java.lang.Double.toString(pitch))) + " ROLL: ") + (java.lang.Double.toString(roll));
    if (view != null) {
        view.setText(s);
    }else {
        java.lang.System.out.println(s);
    }
}