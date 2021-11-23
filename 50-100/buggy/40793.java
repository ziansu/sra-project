public void cbVisibility() {
    if (!(cb.isChecked())) {
        idET.setVisibility(View.INVISIBLE);
        idTV.setVisibility(View.INVISIBLE);
        idET.setText("");
    }else {
        idET.setVisibility(View.VISIBLE);
        idTV.setVisibility(View.VISIBLE);
    }
}