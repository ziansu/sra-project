public void setVisibleTo(boolean visible) {
    setButtonColor((!visible));
    if (visible) {
        pickerFrom.setVisibility(View.INVISIBLE);
        pickerTo.setVisibility(View.VISIBLE);
    }else {
        pickerFrom.setVisibility(View.VISIBLE);
        pickerTo.setVisibility(View.INVISIBLE);
    }
}