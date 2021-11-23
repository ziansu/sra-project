public void clickEdit(android.view.View v) {
    if (((tokens.size()) != 0) && ((display.getRealCursorIndex()) < (tokens.size()))) {
        com.trutech.calculall.Token m = tokens.get(display.getRealCursorIndex());
        if (m instanceof com.trutech.calculall.Matrix) {
            editMatrix(((com.trutech.calculall.Matrix) (m)));
            updateInput();
            return ;
        }
    }
    android.widget.Toast.makeText(this, "Place the cursor before a Matrix to edit it.", Toast.LENGTH_LONG).show();
}