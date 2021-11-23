public void run() {
    if (periodicUpdateCheckbox.isSelected())
        update();
    else
        this.cancel();
    
}