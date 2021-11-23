public void setModal(boolean modal) {
    for (int i = 0; i < (elements.size()); i++)
        elements.get(i).clearTouch();
    
    this.state.modal = modal;
}