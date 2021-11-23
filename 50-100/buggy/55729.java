public void WEB_11744_filterStation() {
    comeToThisPage_direct();
    filterStation();
    java.lang.String chosenStation = firstStationLabel.getText();
    java.lang.System.out.println(("chosen station:" + chosenStation));
    firstStation.click();
    makeSureItIsPlaying();
    java.lang.String playingStation = stationPlaying.getText();
    java.lang.System.out.println(("station PLAYING:" + playingStation));
    if (!(chosenStation.equalsIgnoreCase(playingStation)))
        handleError("Filter is not working.", "WEB_11744_filterStation");
    
}