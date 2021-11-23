public void selectBox(Box box) {
    deselectRelation();
    if ((selectedBox) == null) {
        selectedBox = box;
        toolbar.showAddRelationButton();
        toolbar.showDeleteButton();
    }else
        if (box != (selectedBox)) {
            selectedBox.getStyleClass().remove("box-shadow");
            selectedBox = box;
        }
    
    box.getStyleClass().add("box-shadow");
}