public void setPlayer(model.Spieler player) {
    if (moreDetails)
        changeMoreDetails();
    
    if ((changingInformation) && (!(jBtnChangeInformationActionPerformed())))
        return ;
    
    this.player = player;
    setPlayerInformation();
    if (!(addingNewPlayer))
        setPerformance();
    
    showPhoto();
}