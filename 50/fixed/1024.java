public void setOnTop() {
    if ((this.getParent()) != null)
        this.setZIndex(((this.getParent().getChildren().size) + 1));
    
}