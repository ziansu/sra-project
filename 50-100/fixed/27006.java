private android.widget.TextView getAdjustedColumnOfRow(android.widget.TableRow pR) {
    android.widget.TextView adjustedColumn = null;
    for (int i = 0; i < (pR.getChildCount()); i++) {
        if ((pR.getChildAt(i).getId()) == (R.id.measurementsTableColumnAdjusted)) {
            adjustedColumn = ((android.widget.TextView) (pR.getChildAt(i)));
            break;
        }
    }
    return adjustedColumn;
}