private void onSeatClicked(T seat) {
    if ((mClickListener) != null) {
        mClickListener.onSeatClicked(seat);
    }
}