private void dev() {
    if ((shipCheckArea(lastShipTouched[0])) & (!(shipOutsideLayout(lastShipTouched[0])))) {
        arrShips[lastShipTouched[0]].clearColorFilter();
    }else {
        arrShips[lastShipTouched[0]].setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
    }
}