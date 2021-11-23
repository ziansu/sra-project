public void goBack() {
    if ((indexAcum) > 20) {
        if (((indexAcum) % 20) != 0)
            indexAcum -= ((indexAcum) % 20) + 20;
        else
            indexAcum -= 40;
        
        fillPnlGrid();
    }else
        new castboard.view.FailureNotificationPopUp(masterFrame).display("Ha llegado al principio del catálogo");
    
}