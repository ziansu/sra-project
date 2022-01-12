private boolean checkInBounds(float x, float y) {
    return ((((getLeft()) + ((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2)) < x) && (x < ((getRight()) - ((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2)))) && ((((getTop()) + ((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2)) < y) && (y < ((getBottom()) - ((com.bhullnatik.gonioview.GonioView.HANDLE_SIZE) / 2))));
}