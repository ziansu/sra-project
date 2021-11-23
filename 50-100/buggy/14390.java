@java.lang.Override
public java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) {
    try {
        int input = java.lang.Integer.parseInt(((dest.toString()) + (source.toString())));
        if (isInRange(min, max, input))
            return null;
        
    } catch (java.lang.NumberFormatException nfe) {
    }
    return "";
}