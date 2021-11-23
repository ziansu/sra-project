public void animateFAB() {
    if (isFabOpen) {
        addButton.startAnimation(rotate_backward);
        noteAddButton.startAnimation(fab_close);
        noteAddButton.setClickable(false);
        isFabOpen = false;
    }else {
        addButton.startAnimation(rotate_forward);
        noteAddButton.startAnimation(fab_open);
        noteAddButton.setClickable(true);
        isFabOpen = true;
    }
}