private boolean checkInBounds(float x, float y) {
    return ((((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2) < x) && (x < ((getRight()) - ((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2)))) && ((((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2) < y) && (y < ((getBottom()) - ((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2))));
}