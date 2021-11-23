@java.lang.Override
public void addValue(java.lang.Object value) {
    try {
        java.lang.Double temp = java.lang.Double.parseDouble(((java.lang.String) (value)));
        totalRange.updateBounds(temp);
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
    }
}