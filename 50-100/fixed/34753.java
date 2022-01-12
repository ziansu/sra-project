public void selectBox(Box box) {
    deselectRelation();
    if ((selectedBox) == null) {
        selectedBox = box;
        toolbar.showAddRelationButton();
        toolbar.showDeleteButton();
        box.getStyleClass().add("box-shadow");
    }else
        if (box != (selectedBox)) {
            selectedBox.getStyleClass().remove("box-shadow");
            selectedBox = box;
            box.getStyleClass().add("box-shadow");
        }
    
}