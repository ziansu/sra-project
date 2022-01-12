private void select(int position) {
    if ((mCurrentPosition) != position) {
        postSelectionMsg(position);
    }
}