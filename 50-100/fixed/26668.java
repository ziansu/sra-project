private java.lang.String getPipeNumberColValueOfRow(android.widget.TableRow pR) {
    java.lang.String pipeNum = "0";
    for (int i = 0; i < (pR.getChildCount()); i++) {
        if ((pR.getChildAt(i).getId()) == (R.id.measurementsTableColumnPipeNum)) {
            android.widget.TextView tV = ((android.widget.TextView) (pR.getChildAt(i)));
            pipeNum = tV.getText().toString();
            break;
        }
    }
    return pipeNum;
}