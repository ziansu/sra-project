private void setDateTextView() {
    if ((((year) == 0) && ((month) == 0)) && ((day) == 0)) {
        dateView.setText("Due Date: -");
    }else {
        dateView.setText(((((("Due Date: " + (1 + (month))) + "/") + (day)) + "/") + (year)));
    }
}