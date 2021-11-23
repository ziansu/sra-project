protected void checkBoxChanged(java.awt.event.ItemEvent event) {
    if ((java.awt.event.ItemEvent.SELECTED) == (event.getStateChange())) {
        this.model.setObjectList(this.getAllUsers());
    }else {
        this.updateObjectList();
    }
}