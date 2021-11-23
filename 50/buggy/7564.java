public void setNumber(int number) {
    numberTv.setText(java.lang.String.valueOf(number));
    update();
    if ((listener) != null) {
        listener.onNumberChanged(this);
    }
}