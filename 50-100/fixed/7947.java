private java.util.ArrayList<java.lang.Double> userInputToValues(java.util.ArrayList<android.widget.TextView> input) {
    java.util.ArrayList<java.lang.Double> values = new java.util.ArrayList<java.lang.Double>();
    for (android.widget.TextView t : input) {
        if ((t.getText()) != null) {
            values.add(java.lang.Double.parseDouble(t.getText().toString()));
        }else {
            return null;
        }
    }
    return values;
}