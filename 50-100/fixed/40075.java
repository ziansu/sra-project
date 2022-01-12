@java.lang.Override
protected void onPostExecute(java.lang.Double value) {
    super.onPostExecute(value);
    if (((alpha) >= 0) && ((betta) >= 0)) {
        double height = 0;
        if (((alpha) != 0) && ((betta) != 0))
            height = roundNumber(calculateHeight(alpha, betta, dialog.getParams()), 1);
        
        heightView.setText(("" + height));
    }
}