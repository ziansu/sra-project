private java.lang.String getAdjustedColValueOfRow(android.widget.TableRow pR) {
    java.lang.String adjusted = "";
    for (int i = 0; i < (pR.getChildCount()); i++) {
        if ((pR.getChildAt(i).getId()) == (R.id.measurementsTableColumnAdjusted)) {
            android.widget.TextView tV = ((android.widget.TextView) (pR.getChildAt(i)));
            adjusted = tV.getText().toString();
            break;
        }
    }
    return adjusted;
}