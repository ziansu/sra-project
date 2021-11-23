public static boolean allNumbersValid(java.util.Vector<?> textFields) {
    for (java.lang.Object text : textFields) {
        java.lang.String string = ((java.awt.TextField) (text)).getText();
        if ((string.length()) == 0)
            return false;
        
        if ((string.equals("∞")) || (string.equals("-∞")))
            continue;
        
        try {
            java.lang.Double.parseDouble(string);
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }
    return true;
}