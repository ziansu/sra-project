private void setTotalLengthOfRow(android.widget.TableRow pR, java.lang.String pTotalLength) {
    for (int i = 0; i < (pR.getChildCount()); i++) {
        if ((pR.getChildAt(i).getId()) == (R.id.measurementsTableColumnActual)) {
            android.widget.TextView tV = ((android.widget.TextView) (pR.getChildAt(i)));
            tV.setText(pTotalLength);
        }
    }
}