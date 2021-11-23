public void onClick(android.view.View v) {
    java.lang.Integer tag = ((java.lang.Integer) (v.getTag()));
    if ((currentCell) != null) {
        if (tag == (currentCell.getNumber())) {
            currentCell.clearCell();
        }else {
            currentCell.setNumber(tag);
        }
        updateButtons();
    }
}