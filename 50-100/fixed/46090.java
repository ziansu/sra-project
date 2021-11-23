public void animateFAB() {
    if (isFabOpen) {
        addButton.startAnimation(rotate_backward);
        noteAddButton.startAnimation(fab_close);
        fachAddButton.startAnimation(fab_close);
        noteAddButton.setEnabled(false);
        fachAddButton.setEnabled(false);
        isFabOpen = false;
    }else {
        addButton.startAnimation(rotate_forward);
        noteAddButton.startAnimation(fab_open);
        fachAddButton.startAnimation(fab_open);
        noteAddButton.setEnabled(true);
        fachAddButton.setEnabled(true);
        isFabOpen = true;
    }
}