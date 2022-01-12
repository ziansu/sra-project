@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if ((editable.toString().length()) > 0) {
        try {
            homeAltMiles = java.lang.Integer.parseInt(editable.toString());
            calculateFuel();
        } catch (java.lang.NumberFormatException e) {
        }
    }else
        homeAltMiles = 0;
    
}