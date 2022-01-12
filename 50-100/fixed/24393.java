public void print(android.widget.TextView view) {
    java.lang.String s = (((("YAW: " + (java.lang.Integer.toString(yaw))) + " PITCH: ") + (java.lang.Integer.toString(pitch))) + " ROLL: ") + (java.lang.Integer.toString(roll));
    if (view != null) {
        view.setText(s);
    }else {
        java.lang.System.out.println(s);
    }
}